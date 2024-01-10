package com.products.Aaludra.repository;

import com.products.Aaludra.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,String> {
}
