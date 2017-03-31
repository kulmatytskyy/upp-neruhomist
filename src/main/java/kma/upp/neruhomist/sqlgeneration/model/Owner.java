package kma.upp.neruhomist.sqlgeneration.model;

public class Owner{

	private String name;
	private String phone;
	private boolean legal_owner;
	private String contact_name;
	private String business_type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isLegal_owner() {
		return legal_owner;
	}

	public void setLegal_owner(boolean legal_owner) {
		this.legal_owner = legal_owner;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getBusiness_type() {
		return business_type;
	}

	public void setBusiness_type(String business_type) {
		this.business_type = business_type;
	}

	public String getSurname(){
		return this.name;
	}
	public String toString(){
		if(!legal_owner){
			return "INSERT INTO rent.owners (name, phone, legal_owner) VALUES(\""+this.name+"\", \""
					+ ""+this.phone+"\", "+""+this.legal_owner+");";
		}
		else{
			return "INSERT INTO rent.owners (name, phone, legal_owner, contact_name, business_type) VALUES(\""+this.name+"\", \""
					+ ""+this.phone+"\", "+""+this.legal_owner+", \"" + ""+this.contact_name+"\", \"" + ""+this.business_type+"\");";
		}
	}
}