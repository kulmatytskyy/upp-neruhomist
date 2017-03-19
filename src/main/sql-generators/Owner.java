public class Owner{
	String name;
	String phone;
	boolean legal_owner;
	String contact_name;
	String business_type;
	
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