package com.example.it209.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder 
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class ProductRequest {
    private String name;
    private Double price;
    private Integer quantity;
}
