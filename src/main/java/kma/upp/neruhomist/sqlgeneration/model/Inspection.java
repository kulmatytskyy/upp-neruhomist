package kma.upp.neruhomist.sqlgeneration.model;

import java.time.LocalDate;

public class Inspection{

	private String comment;
	private LocalDate date;
	private int objectID;
	private int workerID;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getObjectID() {
		return objectID;
	}

	public void setObjectID(int objectID) {
		this.objectID = objectID;
	}

	public int getWorkerID() {
		return workerID;
	}

	public void setWorkerID(int workerID) {
		this.workerID = workerID;
	}

	public String toString(){
		return "INSERT INTO rent.inspections (comment, date, "
				+ "objectID, workerID) VALUES(\""+this.comment+"\", DATE'"
				+ this.date + "', "+this.objectID+", "+this.workerID+");";
	}
	
}