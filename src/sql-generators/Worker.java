public class Worker{
	String surname;
	String phone;
	String position;
	
	public String getSurname(){
		return this.surname;
	}
	public String toString(){
		return "INSERT INTO rent.workers (surname, phone, position) VALUES(\""+this.surname+"\", \""
				+ ""+this.phone+"\", "+"\""+""+this.position+"\");";
	}
}