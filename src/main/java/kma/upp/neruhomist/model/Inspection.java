package kma.upp.neruhomist.model;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "inspections")
public class Inspection {

    private Integer inspectionId;
    private String comment;
    private Date date;
    private Integer workerId;
    private Integer objectId;
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

    @Basic
    @Column(name = "workerID")
    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
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

        Inspection that = (Inspection) o;

        if (inspectionId != null ? !inspectionId.equals(that.inspectionId) : that.inspectionId != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (workerId != null ? !workerId.equals(that.workerId) : that.workerId != null) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = inspectionId != null ? inspectionId.hashCode() : 0;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (workerId != null ? workerId.hashCode() : 0);
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
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
}
