package com.spring.product.service.impl;

import com.spring.product.integrator.ProductTypeIntegrator;
import com.spring.product.model.ProductTypeSuccessResponse;
import com.spring.product.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    ProductTypeIntegrator productTypeIntegrator;


    @Override
    public ResponseEntity<ProductTypeSuccessResponse> getProductType() {
        productTypeIntegrator.getProductTypeIntegrator();
        return null;
    }
}
