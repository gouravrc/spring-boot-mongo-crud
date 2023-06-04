package com.spring.product.service;

import com.spring.product.GetProductTypeApiDelegate;
import com.spring.product.model.ProductTypeSuccessResponse;
import org.springframework.http.ResponseEntity;

public interface ProductTypeService extends GetProductTypeApiDelegate {
    public ResponseEntity<ProductTypeSuccessResponse> getProductType();
}
