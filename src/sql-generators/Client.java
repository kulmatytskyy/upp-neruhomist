public class Client{
	String surname;
	String phone;
	String type;
	double maxPayment;
	
	public String getSurname(){
		return this.surname;
	}
	public String toString(){
		return "INSERT INTO rent.clients (surname, phone, type, maximum_payment) VALUES(\""+this.surname+"\", \""
				+ ""+this.phone+"\", "+"\""+""+this.type+"\", "+this.maxPayment+");";
	}
}