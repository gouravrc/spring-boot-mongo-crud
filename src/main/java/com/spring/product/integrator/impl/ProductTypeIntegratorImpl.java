package com.spring.product.integrator.impl;

import com.spring.product.entity.ProductTypeEntity;
import com.spring.product.integrator.ProductTypeIntegrator;
import com.spring.product.model.ProductTypeSuccessResponse;
import com.spring.product.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductTypeIntegratorImpl implements ProductTypeIntegrator {

    @Autowired
    ProductTypeRepository productTypeRepository;

    @Override
    public List<ProductTypeEntity> getProductTypeIntegrator() {
        List<ProductTypeEntity> getProduct = productTypeRepository.findAll();
        return getProduct.stream().collect(Collectors.toList());
    }
}
