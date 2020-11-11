package team2.roommates.repositories;

import org.springframework.data.repository.CrudRepository;
import team2.roommates.models.Invite;

public interface InviteRepository extends CrudRepository<Invite, Integer> {
}
