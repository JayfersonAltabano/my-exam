package com.mybackenexam.backendexam.controller;

import com.mybackenexam.backendexam.dto.SaveProductDTO;
import com.mybackenexam.backendexam.model.ProductEntity;
import com.mybackenexam.backendexam.service.intf.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@Slf4j
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    ResponseEntity<?> addProduct(@RequestBody SaveProductDTO saveProductDTO) {

        try {
            ProductEntity product = productService.addProduct(saveProductDTO);
            return new ResponseEntity<>(product, HttpStatus.OK);
        }catch (Exception e){
            log.info("Error on saving");
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



//    @GetMapping("/productList")
//    List<ProductEntity> productList() {
//        return productService.listAllProducts();
//    }
//
//    @GetMapping("/productList/{category}")
//    List<ProductEntity> productCategoryList(@PathVariable String category) {
//        return productService.productCategoryList(category);
//    }
//
//    @GetMapping("/product/{id}")
//    ProductEntity productById(@PathVariable String id) {
//        return productService.productById(id);
//    }
//
//    @PutMapping("/productUpdate")
//    String updateProduct(@RequestBody ProductEntity productEntity) {
//
//        return productService.updateProduct(productEntity);
//    }
//
//    @DeleteMapping("/product/{id}")
//    String deleteProductById(@PathVariable String id) {
//        return productService.deleteProductById(id);
//    }
}
