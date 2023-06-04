package com.spring.product.integrator.impl;

import com.spring.product.integrator.ProductTypeCreateIntegrator;
import com.spring.product.model.ProductType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeCreateIntegratorImpl implements ProductTypeCreateIntegrator {

    @Override
    public ResponseEntity<ProductType> createProductTypeIntegrator(ProductType productType) {
        System.out.println("create()");

        return null;
    }
}
