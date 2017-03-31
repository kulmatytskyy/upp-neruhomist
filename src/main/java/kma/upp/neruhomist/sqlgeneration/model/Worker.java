package kma.upp.neruhomist.sqlgeneration.model;

public class Worker{

	private String surname;
	private String phone;
	private String position;

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSurname(){
		return this.surname;
	}
	public String toString(){
		return "INSERT INTO rent.workers (surname, phone, position) VALUES(\""+this.surname+"\", \""
				+ ""+this.phone+"\", "+"\""+""+this.position+"\");";
	}
}