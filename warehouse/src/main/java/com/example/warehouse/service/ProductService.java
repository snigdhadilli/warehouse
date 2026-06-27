package com.example.warehouse.service;

import com.example.warehouse.entity.Product;
import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    void deleteProduct(Long id);
}