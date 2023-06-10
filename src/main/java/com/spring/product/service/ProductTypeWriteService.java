package com.spring.product.service;

import com.spring.product.ProductTypeApiDelegate;
import com.spring.product.model.ProductType;
import org.springframework.http.ResponseEntity;

public interface ProductTypeWriteService extends ProductTypeApiDelegate {
    public ResponseEntity<ProductType> createProductType(ProductType productType);

}
