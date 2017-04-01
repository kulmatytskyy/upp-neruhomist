package kma.upp.neruhomist.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Workers {
    private Integer workerId;
    private String surname;
    private String phone;
    private String position;
    private Collection<Contracts> contractsByWorkerId;
    private Collection<Inspections> inspectionsByWorkerId;
    private Collection<Objects> objectsByWorkerId;

    @Id
    @Column(name = "workerID")
    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
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
    @Column(name = "Position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Workers workers = (Workers) o;

        if (workerId != null ? !workerId.equals(workers.workerId) : workers.workerId != null) return false;
        if (surname != null ? !surname.equals(workers.surname) : workers.surname != null) return false;
        if (phone != null ? !phone.equals(workers.phone) : workers.phone != null) return false;
        if (position != null ? !position.equals(workers.position) : workers.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workerId != null ? workerId.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "workersByWorkerId")
    public Collection<Contracts> getContractsByWorkerId() {
        return contractsByWorkerId;
    }

    public void setContractsByWorkerId(Collection<Contracts> contractsByWorkerId) {
        this.contractsByWorkerId = contractsByWorkerId;
    }

    @OneToMany(mappedBy = "workersByWorkerId")
    public Collection<Inspections> getInspectionsByWorkerId() {
        return inspectionsByWorkerId;
    }

    public void setInspectionsByWorkerId(Collection<Inspections> inspectionsByWorkerId) {
        this.inspectionsByWorkerId = inspectionsByWorkerId;
    }

    @OneToMany(mappedBy = "workersByWorkerId")
    public Collection<Objects> getObjectsByWorkerId() {
        return objectsByWorkerId;
    }

    public void setObjectsByWorkerId(Collection<Objects> objectsByWorkerId) {
        this.objectsByWorkerId = objectsByWorkerId;
    }
}
