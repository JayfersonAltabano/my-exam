package com.mybackenexam.backendexam.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document("products")
@Data
@NoArgsConstructor
public class ProductEntity {

    @Id
    private String id;
    private String SKU;
    private String name;
    private String description;
    private String categoryId;
    private BigDecimal cost;
    private BigDecimal price;
    private List<String> tags;

}
