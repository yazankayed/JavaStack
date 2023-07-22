package com.axsos.productsandcategories.repositories;


import com.axsos.productsandcategories.models.Category;
import com.axsos.productsandcategories.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findAll();
    List<Product> findAllByCategories(Category category);
    List<Product> findByCategoriesNotContains(Category product);
}
