package kma.upp.neruhomist.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Contracts {
    private Integer contractId;
    private Date startDate;
    private Date endDate;
    private BigDecimal monthlyPayment;
    private Integer clientId;
    private Integer objectId;
    private Integer workerId;
    private Clients clientsByClientId;
    private Objects objectsByObjectId;
    private Workers workersByWorkerId;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contracts contracts = (Contracts) o;

        if (contractId != null ? !contractId.equals(contracts.contractId) : contracts.contractId != null) return false;
        if (startDate != null ? !startDate.equals(contracts.startDate) : contracts.startDate != null) return false;
        if (endDate != null ? !endDate.equals(contracts.endDate) : contracts.endDate != null) return false;
        if (monthlyPayment != null ? !monthlyPayment.equals(contracts.monthlyPayment) : contracts.monthlyPayment != null)
            return false;
        if (clientId != null ? !clientId.equals(contracts.clientId) : contracts.clientId != null) return false;
        if (objectId != null ? !objectId.equals(contracts.objectId) : contracts.objectId != null) return false;
        if (workerId != null ? !workerId.equals(contracts.workerId) : contracts.workerId != null) return false;

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

    @ManyToOne
    @JoinColumn(name = "workerID", referencedColumnName = "workerID", nullable = false)
    public Workers getWorkersByWorkerId() {
        return workersByWorkerId;
    }

    public void setWorkersByWorkerId(Workers workersByWorkerId) {
        this.workersByWorkerId = workersByWorkerId;
    }
}
