package kma.upp.neruhomist.sqlgeneration.model;

public class Client{

	private String surname;
	private String phone;
	private String type;
	private double maxPayment;

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getMaxPayment() {
		return maxPayment;
	}

	public void setMaxPayment(double maxPayment) {
		this.maxPayment = maxPayment;
	}

	public String getSurname(){
		return this.surname;
	}

	public String toString(){
		return "INSERT INTO rent.clients (surname, phone, type, maximum_payment) VALUES(\""+this.surname+"\", \""
				+ ""+this.phone+"\", "+"\""+""+this.type+"\", "+this.maxPayment+");";
	}
}