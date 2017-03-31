package kma.upp.neruhomist.sqlgeneration.model;

import java.time.LocalDate;

public class Review{

	private String comment;
	private LocalDate date;
	private int objectID;
	private int clientID;

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

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String toString(){
		return "INSERT INTO rent.reviews (comment, date, "
				+ "objectID, clientID) VALUES(\""+this.comment+"\", DATE'"
				+ this.date + "', "+this.objectID+", "+this.clientID+");";
	}
	
}