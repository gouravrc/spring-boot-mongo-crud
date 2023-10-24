package com.spring.product.service;

import com.spring.product.entity.ProductEntity;
import com.spring.product.model.Product;
import com.spring.product.model.ProductCategoriesSuccessResponse;
import org.springframework.http.ResponseEntity;

public interface CreateProductService {

    ResponseEntity<ProductEntity> createProduct(Product product);
}
