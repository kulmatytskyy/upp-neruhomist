package kma.upp.neruhomist.repository;

import kma.upp.neruhomist.model.Client;
import kma.upp.neruhomist.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContractRepository extends JpaRepository<Contract, Integer> {

    List<Contract> findByClient(Client client);

}
