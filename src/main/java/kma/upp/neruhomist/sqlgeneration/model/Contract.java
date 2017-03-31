package kma.upp.neruhomist.sqlgeneration.model;

import java.time.LocalDate;

public class Contract{

	private LocalDate startDate;
	private LocalDate endDate;
	private double monthlyPayment;
	private int objectID;
	private int clientID;
	private int workerID;

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public int getObjectID() {
		return objectID;
	}

	public void setObjectID(int objectID) {
		this.objectID = objectID;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public int getWorkerID() {
		return workerID;
	}

	public void setWorkerID(int workerID) {
		this.workerID = workerID;
	}

	public String toString(){
		return "INSERT INTO rent.contracts (startDate, endDate, monthlyPayment, "
				+ "objectID, clientID, workerID) VALUES(DATE '"
				+ this.startDate+"', DATE '"+this.endDate+"', "+this.monthlyPayment+", "+this.objectID+", "+""+this.clientID+", "+""+this.workerID+");";
	}
	
}