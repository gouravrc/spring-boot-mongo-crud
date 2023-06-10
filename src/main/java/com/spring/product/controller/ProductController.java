package com.spring.product.controller;

import com.spring.product.model.ProductType;
import com.spring.product.model.ProductTypeSuccessResponse;
import com.spring.product.service.ProductTypeCreateService;
import com.spring.product.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductTypeService productTypeService;

    @Autowired
    ProductTypeCreateService productTypeCreateService;

    @GetMapping("/get-product-types")
    public ResponseEntity<ProductTypeSuccessResponse> getProductTypeData(){
        productTypeService.getProductType();
        return null;
    }

    @PostMapping("/product-types")
    public ResponseEntity<ProductType> createProductTypeData(@RequestBody ProductType productType){
        productTypeCreateService.createProductType(productType);
        return new ResponseEntity<>(productType, HttpStatus.OK);
    }
}
