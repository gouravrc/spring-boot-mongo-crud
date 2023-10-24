package com.spring.product.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "producttypes")
public class ProductTypeEntity {


    @Id
    private String id;

    private String name;

    private Integer offer;


}
