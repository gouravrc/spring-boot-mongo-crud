package com.spring.product.integrator;

import com.spring.product.entity.ProductCategoryEntity;
import com.spring.product.model.ProductCategories;

import java.util.List;

public interface ProductCategoriesIntegrator {

    void createProductCategory(ProductCategories productCategories);

    List<ProductCategoryEntity> getProductCategories();

}
