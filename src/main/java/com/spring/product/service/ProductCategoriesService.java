package com.spring.product.service;

import com.spring.product.ProductCategoriesApiDelegate;
import com.spring.product.model.ProductCategories;
import org.springframework.http.ResponseEntity;

public interface ProductCategoriesService extends ProductCategoriesApiDelegate {

    ResponseEntity<ProductCategories> createProductCategories(ProductCategories productCategories);
}
