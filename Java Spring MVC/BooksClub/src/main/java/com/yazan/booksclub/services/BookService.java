package com.yazan.booksclub.services;

import com.yazan.booksclub.models.Book;
import com.yazan.booksclub.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class BookService {
    @Autowired
    private BookRepository bookRepo;
    public List<Book> allBooks(){
        return bookRepo.findAll();
    }
    public Book findBookById(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        }
        return null;
    }


    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
    public Book updateBook(Book b) {
        return bookRepo.save(b);
    }
    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }

}