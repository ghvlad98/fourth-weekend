package com.spring.service.api;

import com.spring.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> findAll();
    public Optional<Product> getProductById(long id);
    public Product addProduct(Product product);
}
