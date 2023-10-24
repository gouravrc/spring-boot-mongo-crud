package com.spring.product.integrator.impl;

import com.spring.product.entity.ProductEntity;
import com.spring.product.integrator.ProductReadIntegrator;
import com.spring.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

public class ProductReadIntegratorImpl implements ProductReadIntegrator {

    @Autowired
    ProductRepository productRepository;
    @Override
    public Page<ProductEntity> getProduct(String id) {
        if(id.equalsIgnoreCase("all")){
            productRepository.findAll();
        }
        return null;
    }
}
