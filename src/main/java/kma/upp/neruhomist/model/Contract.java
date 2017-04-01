package kma.upp.neruhomist.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity(name = "contracts")
public class Contract {

    private Integer contractId;
    private Date startDate;
    private Date endDate;
    private BigDecimal monthlyPayment;
    private Integer clientId;
    private Integer objectId;
    private Integer workerId;
    private Client client;
    private Object object;
    private Worker worker;

    @Id
    @Column(name = "contractID")
    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    @Basic
    @Column(name = "StartDate")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "EndDate")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "monthlyPayment")
    public BigDecimal getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(BigDecimal monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
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

        Contract contract = (Contract) o;

        if (contractId != null ? !contractId.equals(contract.contractId) : contract.contractId != null) return false;
        if (startDate != null ? !startDate.equals(contract.startDate) : contract.startDate != null) return false;
        if (endDate != null ? !endDate.equals(contract.endDate) : contract.endDate != null) return false;
        if (monthlyPayment != null ? !monthlyPayment.equals(contract.monthlyPayment) : contract.monthlyPayment != null)
            return false;
        if (clientId != null ? !clientId.equals(contract.clientId) : contract.clientId != null) return false;
        if (objectId != null ? !objectId.equals(contract.objectId) : contract.objectId != null) return false;
        if (workerId != null ? !workerId.equals(contract.workerId) : contract.workerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contractId != null ? contractId.hashCode() : 0;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (monthlyPayment != null ? monthlyPayment.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (workerId != null ? workerId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "clientID", referencedColumnName = "clientID", nullable = false)
    public Client getClient() {
        return client;
    }

    public void setClient(Client clientByClientId) {
        this.client = clientByClientId;
    }

    @ManyToOne
    @JoinColumn(name = "objectID", referencedColumnName = "objectID", nullable = false)
    public Object getObject() {
        return object;
    }

    public void setObject(Object objectByObjectId) {
        this.object = objectByObjectId;
    }

    @ManyToOne
    @JoinColumn(name = "workerID", referencedColumnName = "workerID", nullable = false)
    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker workerByWorkerId) {
        this.worker = workerByWorkerId;
    }
}
