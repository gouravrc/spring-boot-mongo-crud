package com.spring.product.integrator.impl;

import com.spring.product.entity.ProductTypeEntity;
import com.spring.product.integrator.ProductTypeByIdIntegrator;
import com.spring.product.model.ProductType;
import com.spring.product.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class ProductTypeByIdIntegratorImpl implements ProductTypeByIdIntegrator {

    @Autowired
    ProductTypeRepository productTypeRepository;
    @Override
    public Optional<ProductTypeEntity> createProductTypeByIdIntegrator(String id) {
        return productTypeRepository.findById(id);
    }
}
