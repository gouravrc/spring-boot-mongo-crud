package com.spring.product.service.impl;

import com.spring.product.entity.ProductTypeEntity;
import com.spring.product.integrator.ProductTypeIntegrator;
import com.spring.product.model.ProductTypeSuccessResponse;
import com.spring.product.service.ProductTypeReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeReadService {

    @Autowired
    ProductTypeIntegrator productTypeIntegrator;


    @Override
    public ResponseEntity<ProductTypeSuccessResponse> getProductType() {
        ProductTypeSuccessResponse productTypeSuccessResponse = new ProductTypeSuccessResponse();
        try {
            List<ProductTypeEntity> getProductList = productTypeIntegrator.getProductTypeIntegrator();
            if(getProductList.size() > 0){
                productTypeSuccessResponse.setStatus(200);
                productTypeSuccessResponse.setData(getProductList);
                productTypeSuccessResponse.errors(null);
            }
        }
        catch (Exception error){
            productTypeSuccessResponse.setStatus(400);
            productTypeSuccessResponse.setData(null);
            productTypeSuccessResponse.errors(error);
        }
        return new ResponseEntity<>(productTypeSuccessResponse, HttpStatus.OK);
    }
}
