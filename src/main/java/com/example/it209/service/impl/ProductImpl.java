package com.example.it209.service.impl;

import com.example.it209.model.Product;
import com.example.it209.model.ProductRequest;
import com.example.it209.repository.ProductRepository;
import com.example.it209.service.ProductService;
import lombok.RequiredArgsConstructor;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product addProduct(ProductRequest p) {
        Product product = new Product();
        product.setName(p.getName());
        product.setPrice(p.getPrice());
        product.setQuantity(p.getQuantity());
        return productRepository.save(product);
    }

    @Override
    public Product deleteProductById(Long id) {
        return productRepository.deleteProductById(id);
    }

    @Override
    public Product updateProductById(Long id, ProductRequest p) {
        Product z = findById(id);
        z.setName(p.getName());
        z.setPrice(p.getPrice());
        z.setQuantity(p.getQuantity());
        return productRepository.save(z);
    }
    
}
