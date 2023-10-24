package com.spring.product.service.impl;

import com.spring.product.integrator.ProductTypeWriteIntegrator;
import com.spring.product.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeWriteServiceImpl implements com.spring.product.service.ProductTypeWriteService {

    @Autowired
    ProductTypeWriteIntegrator productTypeWriteIntegrator;
    @Override
    public ResponseEntity<ProductType> createProductType(ProductType productType) {
        productTypeWriteIntegrator.createProductTypeIntegrator(productType);
        return null;
    }
}
