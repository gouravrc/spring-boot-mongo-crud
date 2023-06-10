package com.spring.product.integrator;

import com.spring.product.model.ProductCategories;
import org.springframework.http.ResponseEntity;

public interface ProductCategoriesIntegrator {

    ResponseEntity<ProductCategories> createProductCategory(ProductCategories productCategories);
}
