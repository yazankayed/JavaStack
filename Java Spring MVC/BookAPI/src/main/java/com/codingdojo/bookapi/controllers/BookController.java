package com.codingdojo.bookapi.controllers;

import com.codingdojo.bookapi.models.Book;
import com.codingdojo.bookapi.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
public class BookController {
    private final BookService bookService;
    public BookController(  BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping("/books/{bookid}")
    public String showBook(Model model, @PathVariable("bookid") Long bookid){
        Book pp=bookService.findBook(bookid);
        model.addAttribute("specificbook",pp);
        return "index.jsp";
    }
    @RequestMapping("/books")
    public String showAllBooks(Model model){
        List<Book> pp=  bookService.allBooks();
        model.addAttribute("allbooks",pp);
        return "allbooks.jsp";
    }

}
