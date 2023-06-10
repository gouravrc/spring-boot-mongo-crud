package com.spring.product.controller;

import com.spring.product.model.ProductCategories;
import com.spring.product.service.ProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product/v1/categories")
public class ProductCategoriesController {
    @Autowired
    ProductCategoriesService productCategoriesService;

    @PostMapping("/product-categories")
    public ResponseEntity<ProductCategories> createProductCategories(ProductCategories productCategories){
        try{
            productCategoriesService.createProductCategories(productCategories);
            return new ResponseEntity<>(productCategories, HttpStatus.OK);
        }
        catch (Exception error){
            return new ResponseEntity<>(productCategories, HttpStatus.BAD_REQUEST);
        }
    }
}
