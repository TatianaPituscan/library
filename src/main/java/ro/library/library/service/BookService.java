package ro.library.library.service;

import org.springframework.stereotype.Service;
import ro.library.library.repositories.BookRepository;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

}
