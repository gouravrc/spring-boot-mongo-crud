package com.spring.product.repository;

import com.spring.product.model.ProductType;
import com.spring.product.model.ProductTypeSuccessResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductTypeRepository extends MongoRepository<ProductType,Integer> {

}
