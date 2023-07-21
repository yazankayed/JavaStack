package com.yazan.booksclub.repositories;

import com.yazan.booksclub.models.Book;
import com.yazan.booksclub.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
    Optional<User> findByUserName(String username);

    List<User> findByBooksNotContains(Book book);
    List<User> findByBooksContains(Book book);
}