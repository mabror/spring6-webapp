package mamadaliev.com.spring6webapp.services;

import mamadaliev.com.spring6webapp.domain.Author;

public interface AuthorService {
    public Iterable<Author> findAll();
}
