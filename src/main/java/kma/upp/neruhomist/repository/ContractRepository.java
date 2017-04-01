package kma.upp.neruhomist.repository;

import kma.upp.neruhomist.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
