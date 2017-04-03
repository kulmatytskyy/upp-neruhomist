package kma.upp.neruhomist.repository;

import kma.upp.neruhomist.model.Object;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ObjectRepository extends JpaRepository<Object, Integer> {

    List<Integer> getAllRoomsNum();

}
