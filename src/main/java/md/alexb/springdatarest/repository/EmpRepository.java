package md.alexb.springdatarest.repository;

import md.alexb.springdatarest.model.Emp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmpRepository extends CrudRepository<Emp, Integer> {
}
