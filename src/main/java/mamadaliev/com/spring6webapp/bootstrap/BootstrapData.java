package mamadaliev.com.spring6webapp.bootstrap;

import mamadaliev.com.spring6webapp.domain.Author;
import mamadaliev.com.spring6webapp.domain.Book;
import mamadaliev.com.spring6webapp.domain.Publisher;
import mamadaliev.com.spring6webapp.repositories.AuthorRepository;
import mamadaliev.com.spring6webapp.repositories.BookRepository;
import mamadaliev.com.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;


    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        eric.setFirstName("Rod");
        eric.setLastName("Johnson");

        Book noEjb = new Book();
        noEjb.setTitle("J2EE Developmnet withtout EJB");
        noEjb.setIsbn("54757585");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEjb);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);


        Publisher publisher = new Publisher();
        publisher.setPublisherName("My publisher");
        publisher.setAddress("224 blackstreet");
        Publisher savedPublisher = publisherRepository.save(publisher);

        dddSaved.setPublisher(savedPublisher);
        noEJBSaved.setPublisher(savedPublisher);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);


        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher: " + publisherRepository.count());
    }
}
