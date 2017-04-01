package kma.upp.neruhomist.repository;

import kma.upp.neruhomist.model.Inspection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionRepository extends JpaRepository<Inspection, Integer> {
}
