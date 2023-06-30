package com.spring.product.integrator;

import com.spring.product.model.ProductType;
import org.springframework.http.ResponseEntity;

public interface ProductTypeWriteIntegrator {
    ResponseEntity<ProductType> createProductTypeIntegrator(ProductType productType);

}
