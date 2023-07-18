package com.yazan.burgertrackerone.repositories;

import com.yazan.burgertrackerone.models.Burger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long> {
    // this method retrieves all the books from the database
    List<Burger> findAll();
    // this method finds books with descriptions containing the search string
    List<Burger> findByRestaurantNameContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByBurgerNameContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByBurgerNameStartingWith(String search);
}
