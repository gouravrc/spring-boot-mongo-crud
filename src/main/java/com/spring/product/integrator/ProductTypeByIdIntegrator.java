package com.spring.product.integrator;

import com.spring.product.entity.ProductTypeEntity;
import com.spring.product.model.ProductType;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface ProductTypeByIdIntegrator {
    Optional<ProductTypeEntity> createProductTypeByIdIntegrator(String id);

}
