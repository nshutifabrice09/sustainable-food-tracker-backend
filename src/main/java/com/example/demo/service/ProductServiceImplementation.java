package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService{

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findProductById(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Product existProduct  = productRepository.findProductById(id);
        if(existProduct != null){
            existProduct.setName(product.getName());
            existProduct.setCategory(product.getCategory());
            existProduct.setUnitOfMeasurement(product.getUnitOfMeasurement());
            return productRepository.save(existProduct);
        }
        return null;
    }

    @Override
    public void removeProduct(Long id) {
        productRepository.deleteById(id);
    }
}
