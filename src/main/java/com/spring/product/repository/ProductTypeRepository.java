package com.spring.product.repository;


import com.spring.product.entity.ProductTypeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends MongoRepository<ProductTypeEntity, String> {

}
