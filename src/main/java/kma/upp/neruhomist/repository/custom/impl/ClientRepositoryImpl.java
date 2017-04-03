package kma.upp.neruhomist.repository.custom.impl;

import kma.upp.neruhomist.repository.custom.ClientRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ClientRepositoryImpl implements ClientRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

}
