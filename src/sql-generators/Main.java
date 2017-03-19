import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import main.java.org.fluttercode.datafactory.impl.*;
public class Main {
	private static Random randomGenerator;
	static DataFactory df = new DataFactory();
	static List<Worker> workerList = new ArrayList<Worker>();
	static List<Owner> ownerList = new ArrayList<Owner>();
	static List<Inspection> inspectionList = new ArrayList<Inspection>();
	static List<Review> reviewList = new ArrayList<Review>();
	static List<Client> clientList = new ArrayList<Client>();
	static List<Contract> contractList = new ArrayList<Contract>();
	static List<Object> objectList = new ArrayList<Object>();
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
				if(contract.objectID==i&&contract.startDate.toEpochDay()<=randomDay&&contract.endDate.toEpochDay()>=randomDay){
					goAhead = false;
				}
			}
			if(goAhead){
				LocalDate date = LocalDate.ofEpochDay(randomDay);
				Review review = new Review();
				review.date = date;
				review.objectID = i;
				review.comment = df.getRandomText(70);
				review.clientID = df.getNumberBetween(1, clientList.size());
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
		int objectID = contract.objectID;
		for(int n = 0; n < inspectionsPerContract; n++){
			long min = contract.startDate.toEpochDay();
			long max = contract.endDate.toEpochDay();
			long randomDay = ThreadLocalRandom.current().nextLong(min, max);
			LocalDate date = LocalDate.ofEpochDay(randomDay);
			int workerID = df.getNumberBetween(1, workerList.size());
			String comment = df.getRandomText(70);
			Inspection inspection = new Inspection();
			
			inspection.workerID = workerID;
			inspection.date = date;
			inspection.comment = comment;
			inspection.objectID = objectID;
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
					if(contr.objectID == objectID){
						minDate = contr.endDate.toEpochDay();
					}
				}
			}
			if(minDate<today){
			long randomStartDay = ThreadLocalRandom.current().nextLong(minDate, today);
			long randomEndDay = ThreadLocalRandom.current().nextLong(randomStartDay+1, maxDay);
			LocalDate startDate = LocalDate.ofEpochDay(randomStartDay);
			LocalDate endDate = LocalDate.ofEpochDay(randomEndDay);
			
			Object object = objectList.get(objectID);
			if(randomEndDay>today){
				object.rentedNow = true;
			}
			double payment = object.payment;
			int clientID = df.getNumberBetween(1, clientList.size());
			int workerID = df.getNumberBetween(1, workerList.size());
			contract.monthlyPayment = payment;
			contract.clientID = clientID;
			contract.workerID = workerID;
			contract.objectID = objectID;
			contract.startDate = startDate;
			contract.endDate = endDate;
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
			Object object = new Object();
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
			
			object.address = address;
			object.rooms = rooms;
			object.rentedNow = rentedNow;
			object.payment = payment;
			object.propName = propName;
			object.workerID = workerID;
			object.ownerID = ownerID;
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
	            owner.contact_name = contact_name;
	            owner.business_type = business_type;
	            
	            
			}
			else{
				name = df.getLastName();
			}
			owner.name = name;
			owner.legal_owner = legal_owner;
			owner.phone = phone;
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
            client.surname = name;
            client.type = type;
            client.phone = phone;
            client.maxPayment = max;
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
            worker.surname = name;
            worker.position = position;
            worker.phone = phone;
           // System.out.println(worker);
            writer.println(worker);
            workerList.add(worker);
        }
		writer.close();
	}
}