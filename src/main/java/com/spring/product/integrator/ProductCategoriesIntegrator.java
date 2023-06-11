package com.spring.product.integrator;

import com.spring.product.entity.ProductCategoryEntity;
import com.spring.product.model.ProductCategories;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductCategoriesIntegrator {

    ResponseEntity<ProductCategories> createProductCategory(ProductCategories productCategories);

    List<ProductCategoryEntity> getProductCategories();

}
