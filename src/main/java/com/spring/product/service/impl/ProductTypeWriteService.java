package com.spring.product.service.impl;

import com.spring.product.integrator.ProductTypeCreateIntegrator;
import com.spring.product.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeWriteService implements com.spring.product.service.ProductTypeWriteService {

    @Autowired
    ProductTypeCreateIntegrator productTypeCreateIntegrator;
    @Override
    public ResponseEntity<ProductType> createProductType(ProductType productType) {
        productTypeCreateIntegrator.createProductTypeIntegrator(productType);
        return null;
    }
}
