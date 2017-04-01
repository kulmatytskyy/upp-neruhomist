package kma.upp.neruhomist.repository.impl;

import kma.upp.neruhomist.model.Contract;
import kma.upp.neruhomist.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class JpaContractRepositoryImpl extends SimpleJpaRepository<Contract, Integer> implements ContractRepository {

    public JpaContractRepositoryImpl(@Autowired EntityManager em) {
        super(Contract.class, em);
    }
}
