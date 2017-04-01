package kma.upp.neruhomist.repository.impl;

import kma.upp.neruhomist.model.Object;
import kma.upp.neruhomist.repository.ObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class JpaObjectRepositoryImpl extends SimpleJpaRepository<Object, Integer> implements ObjectRepository {

    public JpaObjectRepositoryImpl(@Autowired  EntityManager em) {
        super(Object.class, em);
    }
}
