package com.yazan.booksclub.controllers;
import com.yazan.booksclub.models.Book;
import com.yazan.booksclub.models.LoginUser;
import com.yazan.booksclub.models.User;
import com.yazan.booksclub.services.BookService;
import com.yazan.booksclub.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private UserService userServ;
    @Autowired
    private BookService bookServ;

    @GetMapping("/")
    public String index(Model model, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            return "redirect:/books";
        }
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "login.jsp";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser,
                           BindingResult result, Model model, HttpSession session) {
        User regUser = userServ.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "login.jsp";
        }
        session.setAttribute("user_id", regUser.getId());
        return "redirect:/books";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
                        BindingResult result, Model model, HttpSession session) {
        User logUser = userServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "login.jsp";
        }
        session.setAttribute("user_id", logUser.getId());
        return "redirect:/books";
    }
    @GetMapping("/books")
    public String success(Model model, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userServ.findUserById(userId);
            List<Book> allBooks = bookServ.allBooks();
            model.addAttribute("currentUser", currentUser);
            model.addAttribute("allBooks", allBooks);
            return "success.jsp";
        }
        return "redirect:/";
    }
    @GetMapping("/books/new")
    public String addBook(Model model, HttpSession session, @ModelAttribute("book") Book book) {
        Long userId = (Long) session.getAttribute("user_id");
        User user = userServ.findUserById(userId);
        model.addAttribute("user", user);
        return "newbook.jsp";
    }
    @PostMapping("/books/new")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "newbook.jsp";
        }
        bookServ.createBook(book);
        return "redirect:/books";
    }
    @GetMapping("/books/{id}")
    public String showBook(@PathVariable("id") Long id, Model model, HttpSession session) {
        Long user_id = (Long) session.getAttribute("user_id");
        Book book = bookServ.findBookById(id);
        model.addAttribute("book", book);
        model.addAttribute("user_id", user_id);
        return "showbook.jsp";
    }
    @GetMapping("/books/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model, HttpSession session) {
        Book book = bookServ.findBookById(id);
        if (session.getAttribute("user_id")==null || session.getAttribute("user_id")!=book.getUser().getId()) {
            return "redirect:/";
        }
        model.addAttribute("book", book);
        return "editbook.jsp";
    }

    @PutMapping("/books/{id}")
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
        if (session.getAttribute("user_id")==null || session.getAttribute("user_id")!=book.getUser().getId()) {
            return "redirect:/";
        }
        if (result.hasErrors()) {
            return "editbook.jsp";
        }
        bookServ.updateBook(book);
        return "redirect:/books";
    }
    @DeleteMapping("/books/{id}")
    public String destroy(@PathVariable("id") Long id, HttpSession session) {
        Book book = bookServ.findBookById(id);
        if (session.getAttribute("user_id")==null || session.getAttribute("user_id")!=book.getUser().getId()) {
            return "redirect:/";
        }
        bookServ.deleteBook(id);
        return "redirect:/books";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
