package team2.roommates.repositories;

import org.springframework.data.repository.CrudRepository;
import team2.roommates.models.Reminder;

public interface ReminderRepository extends CrudRepository<Reminder, Integer> {
}
