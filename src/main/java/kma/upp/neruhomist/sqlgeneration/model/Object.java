package kma.upp.neruhomist.sqlgeneration.model;

public class Object{

	private String address;
	private int rooms;
	private boolean rentedNow;
	private double payment;
	private String propName;
	private int ownerID;
	private int workerID;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public boolean isRentedNow() {
		return rentedNow;
	}

	public void setRentedNow(boolean rentedNow) {
		this.rentedNow = rentedNow;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public String getPropName() {
		return propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public int getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

	public int getWorkerID() {
		return workerID;
	}

	public void setWorkerID(int workerID) {
		this.workerID = workerID;
	}

	public String toString(){
		return "INSERT INTO rent.objects (address, rooms, rentedNow, "
				+ "payment, propName, ownerID, workerID) VALUES(\""+this.address+"\", "
				+ this.rooms+", "+""+this.rentedNow+", "+""+this.payment+", "+"\""+""+this.propName+"\""
						+ ", "+""+this.ownerID+", "+""+this.workerID+");";
	}
	
}