package kma.upp.neruhomist.repository.custom.impl;

import kma.upp.neruhomist.repository.custom.ContractRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ContractRepositoryImpl implements ContractRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

}
