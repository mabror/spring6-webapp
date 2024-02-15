package mamadaliev.com.spring6webapp.services;

import mamadaliev.com.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
