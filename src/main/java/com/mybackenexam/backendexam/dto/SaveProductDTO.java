package com.mybackenexam.backendexam.dto;

import com.mybackenexam.backendexam.model.CategoryEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
public class SaveProductDTO {

    private String name;
    private String SKU;
    private String description;
    private String categoryName;
    private BigDecimal cost;
    private BigDecimal price;
    private List<String> tags;

}
