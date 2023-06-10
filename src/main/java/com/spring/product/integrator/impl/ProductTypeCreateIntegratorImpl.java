package com.spring.product.integrator.impl;

import com.spring.product.entity.ProductTypeEntity;
import com.spring.product.integrator.ProductTypeCreateIntegrator;
import com.spring.product.model.ProductType;
import com.spring.product.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ProductTypeCreateIntegratorImpl implements ProductTypeCreateIntegrator {

    @Autowired
    ProductTypeRepository productTypeRepository;


    @Override
    public ResponseEntity<ProductType> createProductTypeIntegrator(ProductType productType) {
        ProductTypeEntity productTypeEntity = new ProductTypeEntity();
        productTypeEntity.setId(UUID.randomUUID().toString());
        productTypeEntity.setName(productType.getName());
        productTypeEntity.setOffer(productType.getOffer());
        productTypeRepository.save(productTypeEntity);
        return null;
    }
}
