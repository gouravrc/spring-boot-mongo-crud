package com.spring.product.integrator.impl;

import com.spring.product.integrator.ProductTypeIntegrator;
import com.spring.product.model.ProductTypeSuccessResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeIntegratorImpl implements ProductTypeIntegrator {
    @Override
    public ResponseEntity<ProductTypeSuccessResponse> getProductTypeIntegrator() {
        System.out.println("getting product type integrator");
        return null;
    }
}
