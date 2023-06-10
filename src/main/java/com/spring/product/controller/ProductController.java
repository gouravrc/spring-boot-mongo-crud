package com.spring.product.controller;

import com.spring.product.model.ProductType;
import com.spring.product.model.ProductTypeSuccessResponse;
import com.spring.product.service.ProductTypeWriteService;
import com.spring.product.service.ProductTypeReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductTypeReadService productTypeService;

    @Autowired
    ProductTypeWriteService productTypeCreateService;

    @GetMapping("/get-product-types")
    public ResponseEntity<ProductTypeSuccessResponse> getProductTypeData(){
        return productTypeService.getProductType();
    }

    @PostMapping("/product-types")
    public ResponseEntity<ProductType> createProductTypeData(@RequestBody ProductType productType){
        productTypeCreateService.createProductType(productType);
        return new ResponseEntity<>(productType, HttpStatus.OK);
    }

    @GetMapping("/get-product-type-by-id/{id}")
    public ResponseEntity<ProductTypeSuccessResponse> getProductById(@PathVariable("id") String id){
        System.out.println(id);
        return null;
    }
}
