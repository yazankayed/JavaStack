package com.codingdojo.bookapi.services;
import org.springframework.stereotype.Service;
import com.codingdojo.bookapi.models.Book;
import com.codingdojo.bookapi.models.Book;
import com.codingdojo.bookapi.repositories.BookRepository;

import java.util.List;
import java.util.Optional;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public Book deleteBook(Book b) {
        bookRepository.delete(b);
        return null;
    }
    // returns all the books
    public Book updateBook(Book b){ return bookRepository.save(b);}
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book

    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}
