package com.mybackenexam.backendexam.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("categories")
@Data
@NoArgsConstructor
public class CategoryEntity {

    @Id
    private String id;

    @Indexed(unique = true)
    private String name;

    @JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", locale = "en-PH")
    private Date createdDate;
    private String createdBy;


}
