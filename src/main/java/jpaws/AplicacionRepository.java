package jpaws;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "aplicacion", path = "aplicacion")

public interface AplicacionRepository extends PagingAndSortingRepository<Aplicacion, Integer> {
}