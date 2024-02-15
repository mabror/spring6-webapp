package mamadaliev.com.spring6webapp.repositories;

import mamadaliev.com.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
