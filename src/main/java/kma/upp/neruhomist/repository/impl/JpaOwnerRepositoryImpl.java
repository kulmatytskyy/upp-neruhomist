package kma.upp.neruhomist.repository.impl;

import kma.upp.neruhomist.model.Owner;
import kma.upp.neruhomist.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class JpaOwnerRepositoryImpl extends SimpleJpaRepository<Owner, Integer> implements OwnerRepository {

    public JpaOwnerRepositoryImpl(@Autowired  EntityManager em) {
        super(Owner.class, em);
    }
}
