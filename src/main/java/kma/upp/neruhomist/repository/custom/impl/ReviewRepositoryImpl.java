package kma.upp.neruhomist.repository.custom.impl;

import kma.upp.neruhomist.repository.custom.ReviewRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ReviewRepositoryImpl implements ReviewRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

}
