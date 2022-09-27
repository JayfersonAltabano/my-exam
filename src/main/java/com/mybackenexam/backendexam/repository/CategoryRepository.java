package com.mybackenexam.backendexam.repository;

import com.mybackenexam.backendexam.model.CategoryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryEntity, String> {

}
