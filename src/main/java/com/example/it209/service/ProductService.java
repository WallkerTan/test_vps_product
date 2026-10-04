package com.example.it209.service;

import java.util.List;
import com.example.it209.model.Product;
import com.example.it209.model.ProductRequest;

public interface ProductService {
    Product findById(Long id);
    List<Product> findAll();
    Product addProduct(ProductRequest p);
    Product deleteProductById(Long id);
    Product updateProductById(Long id, ProductRequest p);
    
}
