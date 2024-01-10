package com.products.Aaludra.controller;

import com.products.Aaludra.model.Product;
import com.products.Aaludra.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController{
    @Autowired
    ProductRepo repo;

    @GetMapping("/allProducts")
    public List<Product> getAllProduct()
    {
        return repo.findAll();
    }

    @PostMapping("/post")
    public Product addProduct(@RequestBody Product product)
    {
        return repo.save(product);
    }



}
