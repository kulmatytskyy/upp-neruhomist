package kma.upp.neruhomist.repository.impl;

import kma.upp.neruhomist.model.Inspection;
import kma.upp.neruhomist.repository.InspectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class JpaInspectionRepositoryImpl extends SimpleJpaRepository<Inspection, Integer> implements InspectionRepository {

    public JpaInspectionRepositoryImpl(@Autowired  EntityManager em) {
        super(Inspection.class, em);
    }
}
