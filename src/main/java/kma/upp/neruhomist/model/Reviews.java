package kma.upp.neruhomist.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Reviews {
    private Integer reviewId;
    private String comment;
    private Date date;
    private Integer clientId;
    private Integer objectId;
    private Clients clientsByClientId;
    private Objects objectsByObjectId;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reviews reviews = (Reviews) o;

        if (reviewId != null ? !reviewId.equals(reviews.reviewId) : reviews.reviewId != null) return false;
        if (comment != null ? !comment.equals(reviews.comment) : reviews.comment != null) return false;
        if (date != null ? !date.equals(reviews.date) : reviews.date != null) return false;
        if (clientId != null ? !clientId.equals(reviews.clientId) : reviews.clientId != null) return false;
        if (objectId != null ? !objectId.equals(reviews.objectId) : reviews.objectId != null) return false;

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
    public Clients getClientsByClientId() {
        return clientsByClientId;
    }

    public void setClientsByClientId(Clients clientsByClientId) {
        this.clientsByClientId = clientsByClientId;
    }

    @ManyToOne
    @JoinColumn(name = "objectID", referencedColumnName = "objectID", nullable = false)
    public Objects getObjectsByObjectId() {
        return objectsByObjectId;
    }

    public void setObjectsByObjectId(Objects objectsByObjectId) {
        this.objectsByObjectId = objectsByObjectId;
    }
}
