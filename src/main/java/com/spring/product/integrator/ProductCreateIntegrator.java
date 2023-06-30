package com.spring.product.integrator;

import com.spring.product.model.Product;
import org.springframework.http.ResponseEntity;

public interface ProductCreateIntegrator {

    ResponseEntity<Product> createProduct(Product product);
}
