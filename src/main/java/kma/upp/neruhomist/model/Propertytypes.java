package kma.upp.neruhomist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Propertytypes {
    private String propName;
    private Collection<Objects> objectsByPropName;

    @Id
    @Column(name = "propName")
    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Propertytypes that = (Propertytypes) o;

        if (propName != null ? !propName.equals(that.propName) : that.propName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return propName != null ? propName.hashCode() : 0;
    }

    @OneToMany(mappedBy = "propertytypesByPropName")
    public Collection<Objects> getObjectsByPropName() {
        return objectsByPropName;
    }

    public void setObjectsByPropName(Collection<Objects> objectsByPropName) {
        this.objectsByPropName = objectsByPropName;
    }
}
