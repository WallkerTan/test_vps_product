package com.example.it209.controller;

import com.example.it209.model.ApiRespon;
import com.example.it209.model.Product;
import com.example.it209.model.ProductRequest;
import com.example.it209.service.impl.ProductImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user/products")
public class ProductController {

    private final ProductImpl productImpl;

    @GetMapping("/{id}")
    public ResponseEntity<ApiRespon<Product>> getProduct(@PathVariable Long id) {
        return  new ResponseEntity<>(new ApiRespon<>(true,"lay thanh cong",productImpl.findById(id), HttpStatus.OK), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<ApiRespon<List<Product>>> getAllProducts() {
        return new ResponseEntity<>(new ApiRespon<>(true,"lay thanh cong",productImpl.findAll(), HttpStatus.OK), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ApiRespon<Product>> createProduct(@RequestBody ProductRequest product) {
        return new ResponseEntity<>(new ApiRespon<>(true,"them thanh cong",productImpl.addProduct(product),HttpStatus.CREATED),HttpStatus.CREATED);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<ApiRespon<Product>> updateProduct(@PathVariable Long id, @RequestBody ProductRequest product) {
        return new ResponseEntity<>(new ApiRespon<>(true,"update thanh cong",productImpl.updateProductById(id,product),HttpStatus.OK),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ApiRespon<Product>> deleteProduct(@PathVariable Long id) {
        return new ResponseEntity<>(new ApiRespon<>(true,"delete thanh cong",productImpl.deleteProductById(id),HttpStatus.OK),HttpStatus.OK);
    }
}
