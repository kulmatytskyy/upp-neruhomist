
import java.time.LocalDate;

public class Inspection{
	String comment;
	LocalDate date;
	int objectID;
	int workerID;
	
	public String toString(){
		return "INSERT INTO rent.inspections (comment, date, "
				+ "objectID, workerID) VALUES(\""+this.comment+"\", DATE'"
				+ this.date + "', "+this.objectID+", "+this.workerID+");";
	}
	
}