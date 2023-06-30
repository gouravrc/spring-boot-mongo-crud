package com.spring.product.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.product.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
public class ProductEntity {

    @Id
    private String productId;

    private String productType;

    private String productTypeId;

    private String productCategoryName;

    private String productCategoryId;

    private Integer productTrendingScore;

    private String productName;

    private String productBrand;

    private String productBrandId;

    private String productColor;

    private String productColorId;

    private String productTexture;

    private String productTextureId;

    private String productActualPrice;

    private String productSellingPrice;

    private String productCurrencyCode;

    private Integer productTotalPurchase;

    private Integer productTotalReviews;

    private Integer productRatings;

    private Boolean productReturn;

    private String sellerVendorName;

    private Boolean productAvailableInStock;

}
