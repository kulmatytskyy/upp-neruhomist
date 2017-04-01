package kma.upp.neruhomist.model;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.sql.Date;

@Entity(name = "inspections")
@Transactional
public class Inspection {

    private Integer inspectionId;
    private String comment;
    private Date date;
    private Worker worker;
    private Object object;

    @Id
    @Column(name = "inspectionID")
    public Integer getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(Integer inspectionId) {
        this.inspectionId = inspectionId;
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inspection that = (Inspection) o;

        if (inspectionId != null ? !inspectionId.equals(that.inspectionId) : that.inspectionId != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = inspectionId != null ? inspectionId.hashCode() : 0;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "workerID", referencedColumnName = "workerID", nullable = false)
    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker workerByWorkerId) {
        this.worker = workerByWorkerId;
    }

    @ManyToOne
    @JoinColumn(name = "objectID", referencedColumnName = "objectID", nullable = false)
    public Object getObject() {
        return object;
    }

    public void setObject(Object objectByObjectId) {
        this.object = objectByObjectId;
    }

    @Override
    public String toString() {
        return "Inspection{" +
                "inspectionId=" + inspectionId +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                ", worker=" + worker +
                ", object=" + object +
                '}';
    }
}
