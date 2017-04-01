package kma.upp.neruhomist.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
public class Clients {
    private Integer clientId;
    private String surname;
    private String phone;
    private String type;
    private BigDecimal maximumPayment;
    private Collection<Contracts> contractsByClientId;
    private Collection<Reviews> reviewsByClientId;

    @Id
    @Column(name = "clientID")
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "Surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "Maximum_payment")
    public BigDecimal getMaximumPayment() {
        return maximumPayment;
    }

    public void setMaximumPayment(BigDecimal maximumPayment) {
        this.maximumPayment = maximumPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clients clients = (Clients) o;

        if (clientId != null ? !clientId.equals(clients.clientId) : clients.clientId != null) return false;
        if (surname != null ? !surname.equals(clients.surname) : clients.surname != null) return false;
        if (phone != null ? !phone.equals(clients.phone) : clients.phone != null) return false;
        if (type != null ? !type.equals(clients.type) : clients.type != null) return false;
        if (maximumPayment != null ? !maximumPayment.equals(clients.maximumPayment) : clients.maximumPayment != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clientId != null ? clientId.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (maximumPayment != null ? maximumPayment.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "clientsByClientId")
    public Collection<Contracts> getContractsByClientId() {
        return contractsByClientId;
    }

    public void setContractsByClientId(Collection<Contracts> contractsByClientId) {
        this.contractsByClientId = contractsByClientId;
    }

    @OneToMany(mappedBy = "clientsByClientId")
    public Collection<Reviews> getReviewsByClientId() {
        return reviewsByClientId;
    }

    public void setReviewsByClientId(Collection<Reviews> reviewsByClientId) {
        this.reviewsByClientId = reviewsByClientId;
    }
}
