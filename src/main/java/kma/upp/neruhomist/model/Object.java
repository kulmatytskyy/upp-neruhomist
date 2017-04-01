package kma.upp.neruhomist.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity(name = "objects")
public class Object {

    private Integer objectId;
    private String address;
    private Byte rooms;
    private BigDecimal payment;
    private Byte rentedNow;
    private Integer ownerId;
    private String propName;
    private Integer workerId;
    private Collection<Contract> contracts;
    private Collection<Inspection> inspections;
    private Owner owner;
    private PropertyType propertyType;
    private Worker worker;
    private Collection<Review> reviews;

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
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Object object = (Object) o;

        if (objectId != null ? !objectId.equals(object.objectId) : object.objectId != null) return false;
        if (address != null ? !address.equals(object.address) : object.address != null) return false;
        if (rooms != null ? !rooms.equals(object.rooms) : object.rooms != null) return false;
        if (payment != null ? !payment.equals(object.payment) : object.payment != null) return false;
        if (rentedNow != null ? !rentedNow.equals(object.rentedNow) : object.rentedNow != null) return false;
        if (ownerId != null ? !ownerId.equals(object.ownerId) : object.ownerId != null) return false;
        if (propName != null ? !propName.equals(object.propName) : object.propName != null) return false;
        if (workerId != null ? !workerId.equals(object.workerId) : object.workerId != null) return false;

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

    @OneToMany(mappedBy = "object")
    public Collection<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Collection<Contract> contractByObjectId) {
        this.contracts = contractByObjectId;
    }

    @OneToMany(mappedBy = "object")
    public Collection<Inspection> getInspections() {
        return inspections;
    }

    public void setInspections(Collection<Inspection> inspectionByObjectId) {
        this.inspections = inspectionByObjectId;
    }

    @ManyToOne
    @JoinColumn(name = "ownerID", referencedColumnName = "ownerID", nullable = false)
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner ownerByOwnerId) {
        this.owner = ownerByOwnerId;
    }

    @ManyToOne
    @JoinColumn(name = "propName", referencedColumnName = "propName", nullable = false)
    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyTypeByPropName) {
        this.propertyType = propertyTypeByPropName;
    }

    @ManyToOne
    @JoinColumn(name = "workerID", referencedColumnName = "workerID", nullable = false)
    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker workerByWorkerId) {
        this.worker = workerByWorkerId;
    }

    @OneToMany(mappedBy = "objects")
    public Collection<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Collection<Review> reviewByObjectId) {
        this.reviews = reviewByObjectId;
    }
}
