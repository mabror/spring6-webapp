package mamadaliev.com.spring6webapp.repositories;

import mamadaliev.com.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {


}
