package com.example.springbootelasticsearchexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootelasticsearchexample.entity.Product;
import com.example.springbootelasticsearchexample.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo  productRepo;

    public Iterable<Product> getProducts() {
     return productRepo.findAll();
    }

    public Product insertProduct(Product product) {
        return productRepo.save(product);
    }

    public Product updateProduct(Product product, int id) {
        Product product1  = productRepo.findById(id).get();
        product1.setPrice(product.getPrice());
        return product1;
    }

    public void deleteProduct(int id ) {
        productRepo.deleteById(id);
    }
    
    
    public List<Product> getByProducName(String name){
    	return productRepo.findByName(name);
    }
    
    public List<Product> performFullTextSearch(String searchTerm ){
    	return productRepo.findByDescriptionContaining(searchTerm);
    }
    
    public List<Product> performFullTextSearchOnName(String searchTerm ){
    	return productRepo.findByNameContaining(searchTerm);
    }
    
    public Product updateProductById(Double updatedPrice,Integer id) {
  
    	Optional<Product> optional = productRepo.findById(id);
    	if (optional.isPresent()) {
    	    Product product = optional.get();
    	    product.setPrice(updatedPrice);
    	    return product;
    	}

    	return null;
    }


}
