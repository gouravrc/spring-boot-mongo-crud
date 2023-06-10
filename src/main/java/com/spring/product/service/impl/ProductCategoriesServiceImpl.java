package com.spring.product.service.impl;

import com.spring.product.integrator.ProductCategoriesIntegrator;
import com.spring.product.model.ProductCategories;
import com.spring.product.service.ProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoriesServiceImpl implements ProductCategoriesService {

    @Autowired
    ProductCategoriesIntegrator productCategoriesIntegrator;

    @Override
    public ResponseEntity<ProductCategories> createProductCategories(ProductCategories productCategories) {
        productCategoriesIntegrator.createProductCategory(productCategories);
        return null;
    }
}
