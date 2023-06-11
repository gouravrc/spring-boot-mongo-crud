package com.spring.product.service.impl;

import com.spring.product.entity.ProductCategoryEntity;
import com.spring.product.integrator.ProductCategoriesIntegrator;
import com.spring.product.model.ProductCategoriesSuccessResponse;
import com.spring.product.service.ProductCategoriesReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoriesReadServiceImpl implements ProductCategoriesReadService {

    @Autowired
    ProductCategoriesIntegrator productCategoriesIntegrator;

    @Override
    public ResponseEntity<ProductCategoriesSuccessResponse> getProductCategories() {
        ProductCategoriesSuccessResponse productCategoriesSuccessResponse = new ProductCategoriesSuccessResponse();

        try {
            List<ProductCategoryEntity> productCategoryEntityList = productCategoriesIntegrator.getProductCategories();
            if(productCategoryEntityList.size() > 0){
                productCategoriesSuccessResponse.setStatus(200);
                productCategoriesSuccessResponse.setData(productCategoryEntityList);
                //productCategoriesSuccessResponse.setErrors();
                return new ResponseEntity<>(productCategoriesSuccessResponse, HttpStatus.OK);
            }
            productCategoriesSuccessResponse.setStatus(200);
            productCategoriesSuccessResponse.setData("No Records Found");
            //productCategoriesSuccessResponse.setErrors();
            return new ResponseEntity<>(productCategoriesSuccessResponse, HttpStatus.OK);
        }
        catch (Exception error){
            productCategoriesSuccessResponse.setStatus(400);
            productCategoriesSuccessResponse.setData("Exception");
            //productCategoriesSuccessResponse.setErrors();
            return new ResponseEntity<>(productCategoriesSuccessResponse, HttpStatus.BAD_REQUEST);
        }
    }
}
