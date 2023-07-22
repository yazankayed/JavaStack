package com.axsos.productsandcategories.services;


import com.axsos.productsandcategories.models.Category;
import com.axsos.productsandcategories.models.Product;
import com.axsos.productsandcategories.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    public Category updateCategory(Category category){
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }

    public List<Category> allCategory(){
        return categoryRepository.findAll();
    }

    public List<Category> getAssignedCategory(Product product){
        return categoryRepository.findAllByProducts(product);
    }

    public List<Category> getUnassignedCategory(Product product){
        return categoryRepository.findByProductsNotContains(product);
    }

    public Category findCategory(Long id){
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if(optionalCategory.isPresent()){
            return optionalCategory.get();
        }else {
            return null;
        }
    }
}
