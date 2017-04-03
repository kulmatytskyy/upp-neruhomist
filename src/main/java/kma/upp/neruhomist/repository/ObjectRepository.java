package kma.upp.neruhomist.repository;

import kma.upp.neruhomist.model.Object;
import kma.upp.neruhomist.repository.custom.ObjectRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObjectRepository extends JpaRepository<Object, Integer>, ObjectRepositoryCustom {
}
