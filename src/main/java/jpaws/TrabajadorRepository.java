package jpaws;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "trabajador", path = "trabajador")

public interface TrabajadorRepository extends PagingAndSortingRepository<Trabajador, Integer> {


}
