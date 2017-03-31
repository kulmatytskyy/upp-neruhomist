package kma.upp.neruhomist.sqlgeneration;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.*;
import java.lang.Object;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import kma.upp.neruhomist.sqlgeneration.model.*;
import org.fluttercode.datafactory.impl.*;

public class Main {

	private static Random randomGenerator;
	static DataFactory df = new DataFactory();
	static List<Worker> workerList = new ArrayList<Worker>();
	static List<Owner> ownerList = new ArrayList<Owner>();
	static List<Inspection> inspectionList = new ArrayList<Inspection>();
	static List<Review> reviewList = new ArrayList<Review>();
	static List<Client> clientList = new ArrayList<Client>();
	static List<Contract> contractList = new ArrayList<Contract>();
	static List<java.lang.Object> objectList = new ArrayList<java.lang.Object>();
	static long minDay = LocalDate.of(2010, 1, 1).toEpochDay();
    static long maxDay = LocalDate.of(2019, 12, 31).toEpochDay();
    static long today = LocalDate.of(2017, 3, 17).toEpochDay();
	static List<String> businessTypeList = Arrays.asList("Restaurants", "Construction", "Lawyers", "Groceries", "Fast food", "Security", "Insurance");
	static List<String> clientTypeList = Arrays.asList("Type one", "Type two", "Type three");
	static List<String> positionList = Arrays.asList("Secretary", "Clerk", "Executive", "Junior Executive", "Secretary Assistant", "Assistant Assistant", "Junior Clerk");
	public static void main(String[] args) throws IOException{
		randomGenerator = new Random();
		
		generateWorkers();
		generateClients();
		generateOwners();
		
		generateObjects();
		generateContracts();
		generateInspections();
		generateReviews();
		printObjects();
	}
	private static void printObjects() throws IOException {
		PrintWriter writer = new PrintWriter("src/sql/fill-objects.sql", "UTF-8");
		for(int i = 0; i<objectList.size(); i++){
			writer.println(objectList.get(i));
		}
		writer.close();
		
		
	}
	private static void generateReviews() throws IOException {
		PrintWriter writer = new PrintWriter("src/sql/fill-reviews.sql", "UTF-8");
		for(int i = 0; i < objectList.size(); i++){
			int reviewsPerObject = 2;
			for(int k = 0; k<reviewsPerObject; k++){
			long randomDay = ThreadLocalRandom.current().nextLong(minDay, today);
			
			boolean goAhead = true;
			for(int n = 0; n < contractList.size(); n++){
				Contract contract = contractList.get(n);
				if(contract.getObjectID() ==i&&contract.getStartDate().toEpochDay()<=randomDay&&contract.getEndDate().toEpochDay()>=randomDay){
					goAhead = false;
				}
			}
			if(goAhead){
				LocalDate date = LocalDate.ofEpochDay(randomDay);
				Review review = new Review();
				review.setDate(date);
				review.setObjectID(i);
				review.setComment(df.getRandomText(70));
				review.setClientID(df.getNumberBetween(1, clientList.size()));
				//System.out.println(review);
				writer.println(review);
				reviewList.add(review);
			}
			}
		}
		writer.close();
	}
	private static void generateInspections() throws IOException {
		PrintWriter writer = new PrintWriter("src/sql/fill-inspections.sql", "UTF-8");
		for(int i = 0; i < contractList.size(); i++){
		
		int inspectionsPerContract = df.getNumberBetween(1, 5);
		Contract contract = contractList.get(i);
		int objectID = contract.getObjectID();
		for(int n = 0; n < inspectionsPerContract; n++){
			long min = contract.getStartDate().toEpochDay();
			long max = contract.getEndDate().toEpochDay();
			long randomDay = ThreadLocalRandom.current().nextLong(min, max);
			LocalDate date = LocalDate.ofEpochDay(randomDay);
			int workerID = df.getNumberBetween(1, workerList.size());
			String comment = df.getRandomText(70);
			Inspection inspection = new Inspection();
			
			inspection.setWorkerID(workerID);
			inspection.setDate(date);
			inspection.setComment(comment);
			inspection.setObjectID(objectID);
			inspectionList.add(inspection);
			//System.out.println(inspection);
			writer.println(inspection);
			}
		}
		writer.close();
	}
	private static void generateContracts() throws IOException {
		PrintWriter writer = new PrintWriter("src/sql/fill-contracts.sql", "UTF-8");
		for (int i = 0; i < 2000; i++) {
			Contract contract = new Contract();
			long minDate = minDay;
			int objectID = df.getNumberBetween(1, objectList.size());
			if(contractList.size()!=0){
				for(int n = 0; n<contractList.size(); n++){
					Contract contr = contractList.get(n);
					if(contr.getObjectID() == objectID){
						minDate = contr.getEndDate().toEpochDay();
					}
				}
			}
			if(minDate<today){
			long randomStartDay = ThreadLocalRandom.current().nextLong(minDate, today);
			long randomEndDay = ThreadLocalRandom.current().nextLong(randomStartDay+1, maxDay);
			LocalDate startDate = LocalDate.ofEpochDay(randomStartDay);
			LocalDate endDate = LocalDate.ofEpochDay(randomEndDay);
			
			kma.upp.neruhomist.sqlgeneration.model.Object object = (kma.upp.neruhomist.sqlgeneration.model.Object) objectList.get(objectID);
			if(randomEndDay>today){
				object.setRentedNow(true);
			}
			double payment = object.getPayment();
			int clientID = df.getNumberBetween(1, clientList.size());
			int workerID = df.getNumberBetween(1, workerList.size());
			contract.setMonthlyPayment(payment);
			contract.setClientID(clientID);
			contract.setWorkerID(workerID);
			contract.setObjectID(objectID);
			contract.setStartDate(startDate);
			contract.setEndDate(endDate);
			//System.out.println(contract);
			writer.println(contract);
			contractList.add(contract);
			}
		}
		writer.close();
		
	}
	private static void generateObjects() throws IOException {
		//PrintWriter writer = new PrintWriter("fill-objects.sql", "UTF-8");
		for (int i = 0; i < 1000; i++) {
			kma.upp.neruhomist.sqlgeneration.model.Object object = new kma.upp.neruhomist.sqlgeneration.model.Object() ;
			String address = df.getAddress();
			int rooms = randomGenerator.nextInt(9)+1;
			boolean rentedNow = false;
			double payment = df.getNumberBetween(rooms*1000, rooms*4000);
			boolean living = randomGenerator.nextBoolean();
			String propName;
			if(living){
				propName = "living";
			}
			else{
				propName = "non-living";
			}
			int workerID = df.getNumberBetween(1, workerList.size());
			int ownerID = df.getNumberBetween(1, ownerList.size());
			
			object.setAddress(address);
			object.setRooms(rooms);
			object.setRentedNow(rentedNow);
			object.setPayment(payment);
			object.setPropName(propName);
			object.setWorkerID(workerID);
			object.setOwnerID(ownerID);
			objectList.add(object);
			//writer.println(object);
		}
		//writer.close();
	}
	private static void generateOwners() throws IOException {
		PrintWriter writer = new PrintWriter("src/sql/fill-owners.sql", "UTF-8");
		for (int i = 0; i < 1000; i++) {
			Owner owner = new Owner();
			String phone = df.getNumberText(12);
			boolean legal_owner = randomGenerator.nextBoolean();
			String name;
			String contact_name;
			String business_type;
			if(legal_owner==true){
				name = df.getBusinessName();
				contact_name=df.getLastName();
				int index = randomGenerator.nextInt
	            		(businessTypeList.size());
	            business_type = businessTypeList.get(index);
	            owner.setContact_name(contact_name);
	            owner.setBusiness_type(business_type);
	            
	            
			}
			else{
				name = df.getLastName();
			}
			owner.setName(name);
			owner.setLegal_owner(legal_owner);
			owner.setPhone(phone);
            ownerList.add(owner);
            //System.out.println(owner);
            writer.println(owner);
        }
		writer.close();
	}
	private static void generateClients() throws IOException {
		PrintWriter writer = new PrintWriter("src/sql/fill-clients.sql", "UTF-8");
		for (int i = 0; i < 1000; i++) {          
            String name = df.getLastName();
            int index = randomGenerator.nextInt
            		(clientTypeList.size());
            String type = clientTypeList.get(index);
            String phone = df.getNumberText(12);
            double max = df.getNumberBetween(3000, 50000);
            Client client = new Client();
            client.setSurname(name);
            client.setType(type);
            client.setPhone(phone);
            client.setMaxPayment(max);
            //System.out.println(client);
            writer.println(client);
            clientList.add(client);
        }
		writer.close();
	}
	private static void generateWorkers() throws IOException {
		PrintWriter writer = new PrintWriter("src/sql/fill-workers.sql", "UTF-8");
		for (int i = 0; i < 1000; i++) {          
            String name = df.getLastName();
            int index = randomGenerator.nextInt
            		(positionList.size());
            String position = positionList.get(index);
            String phone = df.getNumberText(12);
            Worker worker = new Worker();
            worker.setSurname(name);
            worker.setPosition(position);
            worker.setPhone(phone);
           // System.out.println(worker);
            writer.println(worker);
            workerList.add(worker);
        }
		writer.close();
	}
}