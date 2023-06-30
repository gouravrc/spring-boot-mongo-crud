package com.spring.product.controller;

import com.spring.product.CreateProductApiController;
import com.spring.product.CreateProductApiDelegate;
import com.spring.product.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController  {


    @PostMapping("/create-product")
    public ResponseEntity<Product> createProduct(Product product){
        System.out.println("Service creatged");
        return null;
    }
}
