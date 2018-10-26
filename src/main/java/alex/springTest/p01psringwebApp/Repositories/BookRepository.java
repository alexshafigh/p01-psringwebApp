package alex.springTest.p01psringwebApp.Repositories;

import alex.springTest.p01psringwebApp.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
