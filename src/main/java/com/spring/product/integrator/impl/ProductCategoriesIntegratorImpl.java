package com.spring.product.integrator.impl;

import com.spring.product.entity.ProductCategoryEntity;
import com.spring.product.entity.ProductTypeEntity;
import com.spring.product.integrator.ProductCategoriesIntegrator;
import com.spring.product.model.ProductCategories;
import com.spring.product.repository.ProductCategoryRepository;
import com.spring.product.repository.ProductTypeRepository;
import com.spring.product.utils.GlobalErrorUitilty;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class ProductCategoriesIntegratorImpl implements ProductCategoriesIntegrator {

    @Autowired
    ProductTypeRepository productTypeRepository;

    @Autowired
    ProductCategoryRepository productCategoryRepository;


    @SneakyThrows
    @Override
    public ResponseEntity<ProductCategories> createProductCategory(ProductCategories productCategories) {
        ProductCategoryEntity productCategoryEntity = new ProductCategoryEntity();
        Optional<ProductTypeEntity> isProductTypeIdExist = productTypeRepository.findById(productCategories.getProductTypeId());
        String isProductCategoryNameExist = productCategoryRepository.findByProductCategoryName(productCategories.getProductCategoryName());
        String isProductTypeIdAndProductCategoryName = productCategoryRepository.findByProductTypeIdAndProductCategoryName(productCategories.getProductTypeId(),productCategories.getProductCategoryName());

        if(isProductTypeIdExist.isPresent()){ // if Product Type ID is valid
            if(isProductTypeIdAndProductCategoryName != null && isProductCategoryNameExist != null && isProductCategoryNameExist.contains(productCategories.getProductCategoryName())){
                throw new GlobalErrorUitilty("Product Category Already Exist");
            }
            else {
                productCategoryEntity.setProductCategoryId(UUID.randomUUID().toString());
                productCategoryEntity.setProductType(productCategories.getProductType());
                productCategoryEntity.setProductTypeId(productCategories.getProductTypeId());
                productCategoryEntity.setProductCategoryName(productCategories.getProductCategoryName());
                productCategoryEntity.setProductTrendingScore(productCategories.getProductTrendingScore());
                productCategoryRepository.save(productCategoryEntity);
            }
        }
        else{
            throw new GlobalErrorUitilty("Product Type ID does not exist");
        }
        return null;
    }

    @Override
    public List<ProductCategoryEntity> getProductCategories() {
        List<ProductCategoryEntity> getProductCategories = productCategoryRepository.findAll();
        return getProductCategories.stream().collect(Collectors.toList());
    }

}
