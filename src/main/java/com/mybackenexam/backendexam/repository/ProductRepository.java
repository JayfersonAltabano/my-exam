package com.mybackenexam.backendexam.repository;

import com.mybackenexam.backendexam.model.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
