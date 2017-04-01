package kma.upp.neruhomist.repository.impl;

import kma.upp.neruhomist.model.Client;
import kma.upp.neruhomist.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class JpaClientRepositoryImpl extends SimpleJpaRepository<Client, Integer> implements ClientRepository {

    public JpaClientRepositoryImpl(@Autowired  EntityManager em) {
        super(Client.class, em);
    }

}
