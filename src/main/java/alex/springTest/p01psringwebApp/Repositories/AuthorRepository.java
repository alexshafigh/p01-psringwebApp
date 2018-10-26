package alex.springTest.p01psringwebApp.Repositories;

import alex.springTest.p01psringwebApp.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author , Long> {

}
