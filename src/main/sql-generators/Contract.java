import java.time.LocalDate;

public class Contract{
	LocalDate startDate;
	LocalDate endDate;
	double monthlyPayment;
	int objectID;
	int clientID;
	int workerID;
	
	public String toString(){
		return "INSERT INTO rent.contracts (startDate, endDate, monthlyPayment, "
				+ "objectID, clientID, workerID) VALUES(DATE '"
				+ this.startDate+"', DATE '"+this.endDate+"', "+this.monthlyPayment+", "+this.objectID+", "+""+this.clientID+", "+""+this.workerID+");";
	}
	
}