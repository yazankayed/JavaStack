package com.yazan.burgertrackerone.services;
import com.yazan.burgertrackerone.models.Burger;
import com.yazan.burgertrackerone.repositories.BurgerRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BurgerService {
    private final BurgerRepository burgerRepository;

    public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }
    // returns all the books
    public List<Burger> allBurgers() {
        return burgerRepository.findAll();
    }
    // creates a book
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
    // retrieves a book
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }
}
