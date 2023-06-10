package com.spring.product.integrator;

import com.spring.product.entity.ProductTypeEntity;
import com.spring.product.model.ProductTypeSuccessResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductTypeIntegrator {
    public List<ProductTypeEntity> getProductTypeIntegrator();
}
