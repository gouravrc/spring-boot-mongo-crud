package com.spring.product.integrator.impl;


import com.spring.product.entity.ProductEntity;
import com.spring.product.integrator.ProductCreateIntegrator;
import com.spring.product.model.Product;
import com.spring.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public class ProductCreateIntegratorImpl implements ProductCreateIntegrator {

    @Autowired
    ProductRepository productRepository;
    @Override
    public ResponseEntity<Product> createProduct(Product product) {

        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductId(UUID.randomUUID().toString());
        productEntity.setProductType(product.getProductType());
        productEntity.setProductTypeId(product.getProductTypeId());
        productEntity.setProductCategoryName(product.getProductCategoryName());
        productEntity.setProductCategoryId(product.getProductCategoryId());
        productEntity.setProductTrendingScore(product.getProductTrendingScore());
        productEntity.setProductName(product.getProductName());
        productEntity.setProductBrand(product.getProductBrand());
        productEntity.setProductBrandId(product.getProductBrandId());
        productEntity.setProductColor(product.getProductColor());
        productEntity.setProductColorId(product.getProductColorId());
        productEntity.setProductTexture(product.getProductTexture());
        productEntity.setProductTextureId(product.getProductTextureId());
        productEntity.setProductActualPrice(product.getProductActualPrice());
        productEntity.setProductSellingPrice(product.getProductSellingPrice());
        productEntity.setProductCurrencyCode(product.getProductCurrencyCode());
        productEntity.setProductTotalPurchase(product.getProductTotalPurchase());
        productEntity.setProductTotalReviews(product.getProductTotalReviews());
        productEntity.setProductRatings(product.getProductRatings());
        productEntity.setProductReturn(product.getProductReturn());
        productEntity.setSellerVendorName(product.getSellerVendorName());
        productEntity.setProductAvailableInStock(product.getProductAvailableInStock());
        productRepository.save(productEntity);

        return null;
    }
}
