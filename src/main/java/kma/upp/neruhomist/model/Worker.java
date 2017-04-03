package kma.upp.neruhomist.model;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Collection;

@Entity(name = "workers")
@Transactional
public class Worker {

    private Integer workerId;
    private String surname;
    private String phone;
    private String position;
    private Collection<Contract> contracts;
    private Collection<Inspection> inspections;
    private Collection<Object> objects;

    public Worker() {
    }

    public Worker(Integer workerId) {
        this.workerId = workerId;
    }

    @Id
    @Column(name = "workerID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (workerId != null ? !workerId.equals(worker.workerId) : worker.workerId != null) return false;
        if (surname != null ? !surname.equals(worker.surname) : worker.surname != null) return false;
        if (phone != null ? !phone.equals(worker.phone) : worker.phone != null) return false;
        if (position != null ? !position.equals(worker.position) : worker.position != null) return false;

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

    @OneToMany(mappedBy = "worker")
    public Collection<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Collection<Contract> contractByWorkerId) {
        this.contracts = contractByWorkerId;
    }

    @OneToMany(mappedBy = "worker")
    public Collection<Inspection> getInspections() {
        return inspections;
    }

    public void setInspections(Collection<Inspection> inspectionByWorkerId) {
        this.inspections = inspectionByWorkerId;
    }

    @OneToMany(mappedBy = "worker")
    public Collection<Object> getObjects() {
        return objects;
    }

    public void setObjects(Collection<Object> objectByWorkerId) {
        this.objects = objectByWorkerId;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerId=" + workerId +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
