package com.axsos.productsandcategories.repositories;


import com.axsos.productsandcategories.models.Category;
import com.axsos.productsandcategories.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    List<Category> findAll();
    List<Category> findAllByProducts(Product product);
    List<Category> findByProductsNotContains(Product product);
}
