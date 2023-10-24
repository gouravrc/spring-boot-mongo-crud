package com.spring.product.service;

import com.spring.product.GetProductCategoriesApiDelegate;
import com.spring.product.ProductCategoriesApiDelegate;
import com.spring.product.model.ProductCategoriesSuccessResponse;
import org.springframework.http.ResponseEntity;

public interface ProductCategoriesReadService extends GetProductCategoriesApiDelegate {
    ResponseEntity<ProductCategoriesSuccessResponse> getProductCategories();
}
