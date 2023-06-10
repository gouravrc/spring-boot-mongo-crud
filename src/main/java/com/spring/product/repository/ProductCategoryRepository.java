package com.spring.product.repository;

import com.spring.product.entity.ProductCategoryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryRepository extends MongoRepository<ProductCategoryEntity, String> {

    String findByProductTypeIdAndProductCategoryName(String productTypeId, String productCategoryName);

    String findByProductCategoryName(String productCategoryName);


}
