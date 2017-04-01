package kma.upp.neruhomist.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
public class Objects {
    private Integer objectId;
    private String address;
    private Byte rooms;
    private BigDecimal payment;
    private Byte rentedNow;
    private Integer ownerId;
    private String propName;
    private Integer workerId;
    private Collection<Contracts> contractsByObjectId;
    private Collection<Inspections> inspectionsByObjectId;
    private Owners ownersByOwnerId;
    private Propertytypes propertytypesByPropName;
    private Workers workersByWorkerId;
    private Collection<Reviews> reviewsByObjectId;

    @Id
    @Column(name = "objectID")
    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "rooms")
    public Byte getRooms() {
        return rooms;
    }

    public void setRooms(Byte rooms) {
        this.rooms = rooms;
    }

    @Basic
    @Column(name = "payment")
    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "rentedNow")
    public Byte getRentedNow() {
        return rentedNow;
    }

    public void setRentedNow(Byte rentedNow) {
        this.rentedNow = rentedNow;
    }

    @Basic
    @Column(name = "ownerID")
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "propName")
    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    @Basic
    @Column(name = "workerID")
    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Objects objects = (Objects) o;

        if (objectId != null ? !objectId.equals(objects.objectId) : objects.objectId != null) return false;
        if (address != null ? !address.equals(objects.address) : objects.address != null) return false;
        if (rooms != null ? !rooms.equals(objects.rooms) : objects.rooms != null) return false;
        if (payment != null ? !payment.equals(objects.payment) : objects.payment != null) return false;
        if (rentedNow != null ? !rentedNow.equals(objects.rentedNow) : objects.rentedNow != null) return false;
        if (ownerId != null ? !ownerId.equals(objects.ownerId) : objects.ownerId != null) return false;
        if (propName != null ? !propName.equals(objects.propName) : objects.propName != null) return false;
        if (workerId != null ? !workerId.equals(objects.workerId) : objects.workerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = objectId != null ? objectId.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (rooms != null ? rooms.hashCode() : 0);
        result = 31 * result + (payment != null ? payment.hashCode() : 0);
        result = 31 * result + (rentedNow != null ? rentedNow.hashCode() : 0);
        result = 31 * result + (ownerId != null ? ownerId.hashCode() : 0);
        result = 31 * result + (propName != null ? propName.hashCode() : 0);
        result = 31 * result + (workerId != null ? workerId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "objectsByObjectId")
    public Collection<Contracts> getContractsByObjectId() {
        return contractsByObjectId;
    }

    public void setContractsByObjectId(Collection<Contracts> contractsByObjectId) {
        this.contractsByObjectId = contractsByObjectId;
    }

    @OneToMany(mappedBy = "objectsByObjectId")
    public Collection<Inspections> getInspectionsByObjectId() {
        return inspectionsByObjectId;
    }

    public void setInspectionsByObjectId(Collection<Inspections> inspectionsByObjectId) {
        this.inspectionsByObjectId = inspectionsByObjectId;
    }

    @ManyToOne
    @JoinColumn(name = "ownerID", referencedColumnName = "ownerID", nullable = false)
    public Owners getOwnersByOwnerId() {
        return ownersByOwnerId;
    }

    public void setOwnersByOwnerId(Owners ownersByOwnerId) {
        this.ownersByOwnerId = ownersByOwnerId;
    }

    @ManyToOne
    @JoinColumn(name = "propName", referencedColumnName = "propName", nullable = false)
    public Propertytypes getPropertytypesByPropName() {
        return propertytypesByPropName;
    }

    public void setPropertytypesByPropName(Propertytypes propertytypesByPropName) {
        this.propertytypesByPropName = propertytypesByPropName;
    }

    @ManyToOne
    @JoinColumn(name = "workerID", referencedColumnName = "workerID", nullable = false)
    public Workers getWorkersByWorkerId() {
        return workersByWorkerId;
    }

    public void setWorkersByWorkerId(Workers workersByWorkerId) {
        this.workersByWorkerId = workersByWorkerId;
    }

    @OneToMany(mappedBy = "objectsByObjectId")
    public Collection<Reviews> getReviewsByObjectId() {
        return reviewsByObjectId;
    }

    public void setReviewsByObjectId(Collection<Reviews> reviewsByObjectId) {
        this.reviewsByObjectId = reviewsByObjectId;
    }
}
