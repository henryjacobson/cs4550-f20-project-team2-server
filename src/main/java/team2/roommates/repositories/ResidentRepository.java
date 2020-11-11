package team2.roommates.repositories;

import org.springframework.data.repository.CrudRepository;
import team2.roommates.models.Resident;

public interface ResidentRepository extends CrudRepository<Resident, Integer> {
}
