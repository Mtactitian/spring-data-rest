package md.alexb.springdatarest.repository;

import md.alexb.springdatarest.model.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue,Integer> {
}
