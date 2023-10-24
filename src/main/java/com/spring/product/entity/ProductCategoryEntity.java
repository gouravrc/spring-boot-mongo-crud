package com.spring.product.entity;

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
@Document(collection = "productcategories")
public class ProductCategoryEntity {

    @Id
    private String productCategoryId;

    private String productType;

    private String productTypeId;

    private String productCategoryName;

    private Integer productTrendingScore;
}
