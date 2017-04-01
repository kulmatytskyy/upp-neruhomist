package kma.upp.neruhomist.repository.impl;

import kma.upp.neruhomist.model.PropertyType;
import kma.upp.neruhomist.repository.PropertyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class JpaPropertyTypeRepositoryImpl extends SimpleJpaRepository<PropertyType, Integer> implements PropertyTypeRepository {

    public JpaPropertyTypeRepositoryImpl(@Autowired  EntityManager em) {
        super(PropertyType.class, em);
    }
}
