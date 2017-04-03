package kma.upp.neruhomist.repository.custom.impl;

import kma.upp.neruhomist.repository.custom.InspectionRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class InspectionRepositoryImpl implements InspectionRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

}
