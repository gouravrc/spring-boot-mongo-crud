package com.spring.product.integrator;

import com.spring.product.entity.ProductEntity;
import com.spring.product.model.GetProductSuccessResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductReadIntegrator {

    Page<ProductEntity> getProduct(String id);
}
