package com.axsos.productsandcategories.services;


import com.axsos.productsandcategories.models.Category;
import com.axsos.productsandcategories.models.Product;
import com.axsos.productsandcategories.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    public List<Product> allProducts(){
        return productRepository.findAll();
    }

    public List<Product> getAssignedProducts(Category category){
        return productRepository.findAllByCategories(category);
    }

    public List<Product> getUnassignedProducts(Category category){
        return productRepository.findByCategoriesNotContains(category);
    }

    public Product findProduct(Long id){
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        }else {
            return null;
        }
    }


}
