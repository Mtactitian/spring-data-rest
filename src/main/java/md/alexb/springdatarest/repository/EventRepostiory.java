package md.alexb.springdatarest.repository;

import md.alexb.springdatarest.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EventRepostiory extends CrudRepository<Event, Integer> {
}
