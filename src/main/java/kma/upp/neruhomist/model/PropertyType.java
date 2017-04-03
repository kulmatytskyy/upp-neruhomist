package kma.upp.neruhomist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.transaction.Transactional;
import java.util.Collection;

@Entity(name = "propertytypes")
@Transactional
public class PropertyType {

    private String propName;
    private Collection<Object> objects;

    public PropertyType(){}

    public PropertyType(String propName) {
        this.propName = propName;
    }

    @Id
    @Column(name = "propName")
    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PropertyType that = (PropertyType) o;

        if (propName != null ? !propName.equals(that.propName) : that.propName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return propName != null ? propName.hashCode() : 0;
    }

    @OneToMany(mappedBy = "propertyType")
    public Collection<Object> getObjects() {
        return objects;
    }

    public void setObjects(Collection<Object> objectByPropName) {
        this.objects = objectByPropName;
    }

    @Override
    public String toString() {
        return "PropertyType{" +
                "propName='" + propName + '\'' +
                '}';
    }
}
