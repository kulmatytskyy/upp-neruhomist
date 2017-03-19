public class Object{
	String address;
	int rooms;
	boolean rentedNow;
	double payment;
	String propName;
	int ownerID;
	int workerID;
	
	public String toString(){
		return "INSERT INTO rent.objects (address, rooms, rentedNow, "
				+ "payment, propName, ownerID, workerID) VALUES(\""+this.address+"\", "
				+ this.rooms+", "+""+this.rentedNow+", "+""+this.payment+", "+"\""+""+this.propName+"\""
						+ ", "+""+this.ownerID+", "+""+this.workerID+");";
	}
	
}