package com.spring.product.service;

import com.spring.product.GetProductTypeByIdApiDelegate;
import com.spring.product.model.ProductTypeSuccessResponse;
import org.springframework.http.ResponseEntity;

public interface ProductTypeByIdService extends GetProductTypeByIdApiDelegate {

    ResponseEntity<ProductTypeSuccessResponse> getProductTypeById(String id);


}
