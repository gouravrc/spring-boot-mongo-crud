package com.spring.product.controller;

import com.spring.product.CreateProductApi;
import com.spring.product.model.Product;
import com.spring.product.service.CreateProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product/v1/product")
public class ProductController{


    @Autowired
    CreateProductService createProductService;



    @PostMapping("/create-product")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        createProductService.createProduct(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
