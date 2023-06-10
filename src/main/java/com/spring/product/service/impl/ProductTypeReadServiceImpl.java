package com.spring.product.service.impl;

import com.spring.product.entity.ProductTypeEntity;
import com.spring.product.integrator.ProductTypeReadIntegrator;
import com.spring.product.model.ProductTypeSuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeReadServiceImpl implements com.spring.product.service.ProductTypeReadService {

    @Autowired
    ProductTypeReadIntegrator productTypeIntegrator;


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
