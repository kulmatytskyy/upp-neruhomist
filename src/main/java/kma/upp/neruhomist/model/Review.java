package kma.upp.neruhomist.model;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "reviews")
public class Review {

    private Integer reviewId;
    private String comment;
    private Date date;
    private Integer clientId;
    private Integer objectId;
    private Client clients;
    private Object objects;

    @Id
    @Column(name = "reviewID")
    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    @Basic
    @Column(name = "Comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "clientID")
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "objectID")
    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review = (Review) o;

        if (reviewId != null ? !reviewId.equals(review.reviewId) : review.reviewId != null) return false;
        if (comment != null ? !comment.equals(review.comment) : review.comment != null) return false;
        if (date != null ? !date.equals(review.date) : review.date != null) return false;
        if (clientId != null ? !clientId.equals(review.clientId) : review.clientId != null) return false;
        if (objectId != null ? !objectId.equals(review.objectId) : review.objectId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reviewId != null ? reviewId.hashCode() : 0;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "clientID", referencedColumnName = "clientID", nullable = false)
    public Client getClients() {
        return clients;
    }

    public void setClients(Client clientByClientId) {
        this.clients = clientByClientId;
    }

    @ManyToOne
    @JoinColumn(name = "objectID", referencedColumnName = "objectID", nullable = false)
    public Object getObjects() {
        return objects;
    }

    public void setObjects(Object objectByObjectId) {
        this.objects = objectByObjectId;
    }
}
