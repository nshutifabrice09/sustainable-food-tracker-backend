package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product saveProduct (Product product);
    Product updateProduct(Long id, Product product);
    void removeProduct(Long id);
}
