package ro.library.library.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.library.library.entities.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
    Book findByIsbn(String isbn);
}
