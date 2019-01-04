package jpaws;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "incidencia", path = "incidencia")

public interface IncidenciaRepository extends PagingAndSortingRepository<Incidencia, Integer> {
}
