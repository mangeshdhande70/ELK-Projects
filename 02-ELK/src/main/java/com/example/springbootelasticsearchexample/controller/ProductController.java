package com.example.springbootelasticsearchexample.controller;

import com.example.springbootelasticsearchexample.entity.Product;
import com.example.springbootelasticsearchexample.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis")
public class ProductController {


        @Autowired
    private ProductService  productService;
    @GetMapping("/findAll")
    Iterable<Product> findAll(){
       return productService.getProducts();

    }

    @PostMapping("/insert")
    public Product insertProduct(@RequestBody  Product product){
       return productService.insertProduct(product);
    }
    
    @GetMapping(value = "/get/{name}")
    public List<Product> getByProductName(@PathVariable String name){
    	return productService.getByProducName(name);
    }
    
    @GetMapping(value = "/getByTextTerm/{textTerm}")
    public List<Product> getByFullTextSearch(@PathVariable String textTerm){
    	return productService.performFullTextSearch(textTerm);
    }
    
    @GetMapping(value = "/searchByName/{textTerm}")
    public List<Product> getByFullTextSearchOnname(@PathVariable String textTerm){
    	return productService.performFullTextSearchOnName(textTerm);
    }
    
    

}
