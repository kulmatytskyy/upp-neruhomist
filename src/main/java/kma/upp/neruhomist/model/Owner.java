package kma.upp.neruhomist.model;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Collection;

@Entity(name = "owners")
@Transactional
public class Owner {

    private Integer ownerId;
    private String phone;
    private String name;
    private Byte legalOwner;
    private String contactName;
    private String businessType;
    private Collection<Object> objects;

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
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Owner owner = (Owner) o;

        if (ownerId != null ? !ownerId.equals(owner.ownerId) : owner.ownerId != null) return false;
        if (phone != null ? !phone.equals(owner.phone) : owner.phone != null) return false;
        if (name != null ? !name.equals(owner.name) : owner.name != null) return false;
        if (legalOwner != null ? !legalOwner.equals(owner.legalOwner) : owner.legalOwner != null) return false;
        if (contactName != null ? !contactName.equals(owner.contactName) : owner.contactName != null) return false;
        if (businessType != null ? !businessType.equals(owner.businessType) : owner.businessType != null)
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

    @OneToMany(mappedBy = "owner")
    public Collection<Object> getObjects() {
        return objects;
    }

    public void setObjects(Collection<Object> objectByOwnerId) {
        this.objects = objectByOwnerId;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownerId=" + ownerId +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", legalOwner=" + legalOwner +
                ", contactName='" + contactName + '\'' +
                ", businessType='" + businessType + '\'' +
                '}';
    }
}
