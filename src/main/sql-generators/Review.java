
import java.time.LocalDate;

public class Review{
	String comment;
	LocalDate date;
	int objectID;
	int clientID;
	
	public String toString(){
		return "INSERT INTO rent.reviews (comment, date, "
				+ "objectID, clientID) VALUES(\""+this.comment+"\", DATE'"
				+ this.date + "', "+this.objectID+", "+this.clientID+");";
	}
	
}