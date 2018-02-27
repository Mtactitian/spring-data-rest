package md.alexb.springdatarest.repository;

import md.alexb.springdatarest.model.Participant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ParticipantRepository extends CrudRepository<Participant, Integer> {
}
