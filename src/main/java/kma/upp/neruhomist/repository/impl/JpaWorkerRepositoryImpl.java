package kma.upp.neruhomist.repository.impl;

import kma.upp.neruhomist.model.Worker;
import kma.upp.neruhomist.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public class JpaWorkerRepositoryImpl extends SimpleJpaRepository<Worker, Integer> implements WorkerRepository {

    public JpaWorkerRepositoryImpl(@Autowired  EntityManager em) {
        super(Worker.class, em);
    }
}
