package com.example.it209.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiRespon<T> {
    private boolean success;
    private String message;
    private T data;
    private HttpStatus status;
}
