package alex.springTest.p01psringwebApp.bootstrap;

import alex.springTest.p01psringwebApp.Author;
import alex.springTest.p01psringwebApp.Book;
import alex.springTest.p01psringwebApp.Publisher;
import alex.springTest.p01psringwebApp.Repositories.AuthorRepository;
import alex.springTest.p01psringwebApp.Repositories.BookRepository;
import alex.springTest.p01psringwebApp.Repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private PublisherRepository publisherRepository;

    public DevBootStrap(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }
    public void initData(){


        Author eric = new Author("Eric" , "Evans");
        Publisher publisher = new Publisher("Harper Collins" , "num 46 , Long beach,IL . Ohio");
        Book book1 = new Book("Domain Drivern Design" , "1234" , publisher);
        eric.getBooksSet().add(book1);
        book1.getAuthors().add(eric);
        publisherRepository.save(publisher);
        authorRepository.save(eric);
        bookRepository.save(book1);

    }
}
