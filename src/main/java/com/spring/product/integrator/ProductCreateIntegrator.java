package com.spring.product.integrator;

import com.spring.product.entity.ProductEntity;
import com.spring.product.model.Product;
import org.springframework.http.ResponseEntity;

public interface ProductCreateIntegrator {

    ResponseEntity<ProductEntity> createProduct(Product product);
}
