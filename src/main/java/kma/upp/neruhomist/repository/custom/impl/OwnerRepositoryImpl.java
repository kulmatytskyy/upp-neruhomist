package kma.upp.neruhomist.repository.custom.impl;

import kma.upp.neruhomist.repository.custom.OwnerRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OwnerRepositoryImpl implements OwnerRepositoryCustom {

   @PersistenceContext
   private EntityManager entityManager;


}
