package kma.upp.neruhomist.repository;

import kma.upp.neruhomist.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    List<Client> findByPhoneStartingWith(String phone);

}
