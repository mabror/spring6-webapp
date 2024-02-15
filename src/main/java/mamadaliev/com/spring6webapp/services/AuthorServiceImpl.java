package mamadaliev.com.spring6webapp.services;



import mamadaliev.com.spring6webapp.domain.Author;
import mamadaliev.com.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

/**
 * Created by jt, Spring Framework Guru.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}