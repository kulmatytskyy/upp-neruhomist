package kma.upp.neruhomist.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Owners {
    private Integer ownerId;
    private String phone;
    private String name;
    private Byte legalOwner;
    private String contactName;
    private String businessType;
    private Collection<Objects> objectsByOwnerId;

    @Id
    @Column(name = "ownerID")
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "legal_owner")
    public Byte getLegalOwner() {
        return legalOwner;
    }

    public void setLegalOwner(Byte legalOwner) {
        this.legalOwner = legalOwner;
    }

    @Basic
    @Column(name = "Contact_Name")
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Basic
    @Column(name = "Business_Type")
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Owners owners = (Owners) o;

        if (ownerId != null ? !ownerId.equals(owners.ownerId) : owners.ownerId != null) return false;
        if (phone != null ? !phone.equals(owners.phone) : owners.phone != null) return false;
        if (name != null ? !name.equals(owners.name) : owners.name != null) return false;
        if (legalOwner != null ? !legalOwner.equals(owners.legalOwner) : owners.legalOwner != null) return false;
        if (contactName != null ? !contactName.equals(owners.contactName) : owners.contactName != null) return false;
        if (businessType != null ? !businessType.equals(owners.businessType) : owners.businessType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ownerId != null ? ownerId.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (legalOwner != null ? legalOwner.hashCode() : 0);
        result = 31 * result + (contactName != null ? contactName.hashCode() : 0);
        result = 31 * result + (businessType != null ? businessType.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "ownersByOwnerId")
    public Collection<Objects> getObjectsByOwnerId() {
        return objectsByOwnerId;
    }

    public void setObjectsByOwnerId(Collection<Objects> objectsByOwnerId) {
        this.objectsByOwnerId = objectsByOwnerId;
    }
}
