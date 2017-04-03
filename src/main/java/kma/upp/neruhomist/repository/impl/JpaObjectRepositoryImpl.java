package kma.upp.neruhomist.repository.impl;

import kma.upp.neruhomist.model.Object;
import kma.upp.neruhomist.repository.ObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class JpaObjectRepositoryImpl extends SimpleJpaRepository<Object, Integer> implements ObjectRepository {

    private static final String SELECT_DISTINCT_ROOMS_SQL = "select distinct rooms from objects order by rooms";

    @Autowired
    private EntityManager entityManager;

    public JpaObjectRepositoryImpl(@Autowired  EntityManager em) {
        super(Object.class, em);
    }

    @Override
    public List<Integer> getAllRoomsNum() {
        return entityManager.createNativeQuery(SELECT_DISTINCT_ROOMS_SQL, Integer.class).getResultList();
    }

}
