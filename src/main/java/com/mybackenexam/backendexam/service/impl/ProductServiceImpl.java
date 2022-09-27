package com.mybackenexam.backendexam.service.impl;

import com.mybackenexam.backendexam.dto.SaveProductDTO;
import com.mybackenexam.backendexam.model.ProductEntity;
import com.mybackenexam.backendexam.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ProductServiceImpl {

    @Autowired
    private ProductRepository productRepository;


    //add productList

    public ProductEntity saveProduct(SaveProductDTO saveProductDTO){

        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(saveProductDTO.getName());
        productEntity.setSKU(saveProductDTO.getSKU());
        productEntity.setDescription(saveProductDTO.getDescription());
        productEntity.setPrice(saveProductDTO.getPrice());
        productEntity.setCost(saveProductDTO.getCost());
        productEntity.setTags(saveProductDTO.getTags());
        productEntity.setCategoryId(saveProductDTO.getCategoryName());

        return productRepository.save(productEntity);

    }

    //Show All Products
//    public List<ProductEntity> listAllProducts(){
//        return productRepository.findAll();
//    }

    //Category List
//    public List<ProductEntity> productCategoryList(String category){
//        return productRepository.findByCategory(category);
//    }
//
//    //get The Product id
//    public ProductEntity productById(String id){
//        return productRepository.findById(id).get();
//    }
//
//    //Update Product
//    public String updateProduct(ProductEntity productEntity){
//
//                productRepository.save(productEntity);
//        return "product updated ";
//    }
//
//    //Delete Product Category
//    public String deleteProductById(String id){
//
//        productRepository.deleteById(id);
//        return "product deleted";
//    }
}
