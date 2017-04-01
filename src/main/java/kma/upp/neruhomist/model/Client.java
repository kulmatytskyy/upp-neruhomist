package kma.upp.neruhomist.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity(name = "clients")
public class Client {

    private Integer clientId;
    private String surname;
    private String phone;
    private String type;
    private BigDecimal maximumPayment;
    private Collection<Contract> contracts;
    private Collection<Review> reviews;

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
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (clientId != null ? !clientId.equals(client.clientId) : client.clientId != null) return false;
        if (surname != null ? !surname.equals(client.surname) : client.surname != null) return false;
        if (phone != null ? !phone.equals(client.phone) : client.phone != null) return false;
        if (type != null ? !type.equals(client.type) : client.type != null) return false;
        if (maximumPayment != null ? !maximumPayment.equals(client.maximumPayment) : client.maximumPayment != null)
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

    @OneToMany(mappedBy = "client")
    public Collection<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Collection<Contract> contractByClientId) {
        this.contracts = contractByClientId;
    }

    @OneToMany(mappedBy = "clients")
    public Collection<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Collection<Review> reviewByClientId) {
        this.reviews = reviewByClientId;
    }
}
