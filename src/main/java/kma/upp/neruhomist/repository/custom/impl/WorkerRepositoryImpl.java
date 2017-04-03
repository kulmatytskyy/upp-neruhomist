package kma.upp.neruhomist.repository.custom.impl;

import kma.upp.neruhomist.repository.custom.WorkerRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class WorkerRepositoryImpl implements WorkerRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

}
