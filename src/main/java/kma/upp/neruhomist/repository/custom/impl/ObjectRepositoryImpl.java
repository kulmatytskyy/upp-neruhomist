package kma.upp.neruhomist.repository.custom.impl;

import kma.upp.neruhomist.repository.custom.ObjectRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class ObjectRepositoryImpl implements ObjectRepositoryCustom {

    private static final String SELECT_DISTINCT_ROOMS_SQL = "select distinct rooms from objects order by rooms";

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Byte> allRoomsNum() {
        return entityManager.createNativeQuery(SELECT_DISTINCT_ROOMS_SQL).getResultList();
    }

}
