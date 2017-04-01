package kma.upp.neruhomist.repository;

import kma.upp.neruhomist.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
