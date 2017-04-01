package kma.upp.neruhomist.repository;

import kma.upp.neruhomist.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}
