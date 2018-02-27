package md.alexb.springdatarest.repository;

import md.alexb.springdatarest.model.Organizer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "organizers")
public interface OrganizerRepository extends CrudRepository<Organizer, Integer> {
}
