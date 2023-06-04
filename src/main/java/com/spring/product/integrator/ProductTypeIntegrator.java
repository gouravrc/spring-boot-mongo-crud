package com.spring.product.integrator;

import com.spring.product.model.ProductTypeSuccessResponse;
import org.springframework.http.ResponseEntity;

public interface ProductTypeIntegrator {
    public ResponseEntity<ProductTypeSuccessResponse> getProductTypeIntegrator();
}
