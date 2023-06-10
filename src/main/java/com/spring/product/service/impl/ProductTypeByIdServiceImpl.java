package com.spring.product.service.impl;

import com.spring.product.entity.ProductTypeEntity;
import com.spring.product.integrator.ProductTypeByIdIntegrator;
import com.spring.product.model.ProductTypeSuccessResponse;
import com.spring.product.service.ProductTypeByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ProductTypeByIdServiceImpl implements ProductTypeByIdService {

    @Autowired
    ProductTypeByIdIntegrator productTypeByIdIntegrator;

    @Override
    public ResponseEntity<ProductTypeSuccessResponse> getProductTypeById(String id) {
        ProductTypeSuccessResponse productTypeSuccessResponse = new ProductTypeSuccessResponse();
        Optional<ProductTypeEntity> getProductById = productTypeByIdIntegrator.createProductTypeByIdIntegrator(id);
        try{
            if(getProductById.isPresent()){
                productTypeSuccessResponse.setStatus(200);
                productTypeSuccessResponse.setData(getProductById);
                productTypeSuccessResponse.setErrors(null);
                return new ResponseEntity<>(productTypeSuccessResponse, HttpStatus.OK);
            }
            else{
                productTypeSuccessResponse.setStatus(404);
                productTypeSuccessResponse.setData(null);
                productTypeSuccessResponse.setErrors("Product ID invalid");
                return new ResponseEntity<>(productTypeSuccessResponse, HttpStatus.NOT_FOUND);
            }

        } catch (Exception error){
            productTypeSuccessResponse.setStatus(400);
            productTypeSuccessResponse.setData(null);
            productTypeSuccessResponse.setErrors("Bad ID");
            return new ResponseEntity<>(productTypeSuccessResponse, HttpStatus.BAD_REQUEST);
        }
    }
}
