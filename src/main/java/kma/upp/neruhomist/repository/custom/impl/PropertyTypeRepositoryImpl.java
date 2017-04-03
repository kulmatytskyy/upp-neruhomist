package kma.upp.neruhomist.repository.custom.impl;

import kma.upp.neruhomist.repository.custom.PropertyTypeRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PropertyTypeRepositoryImpl implements PropertyTypeRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

}
