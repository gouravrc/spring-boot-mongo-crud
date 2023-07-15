package com.spring.product.service.impl;

import com.spring.product.entity.ProductEntity;
import com.spring.product.integrator.ProductCreateIntegrator;
import com.spring.product.model.Product;
import com.spring.product.service.CreateProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateProductServiceImpl implements CreateProductService {

    @Autowired
    ProductCreateIntegrator productCreateIntegrator;
    @Override
    public ResponseEntity<ProductEntity> createProduct(Product product) {
        return productCreateIntegrator.createProduct(product);
    }
}
