package kma.upp.neruhomist.repository;

import kma.upp.neruhomist.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
