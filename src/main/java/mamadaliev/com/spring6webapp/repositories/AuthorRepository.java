package mamadaliev.com.spring6webapp.repositories;

import mamadaliev.com.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
