package com.mybackenexam.backendexam.controller;

import com.mybackenexam.backendexam.dto.CategoryDTO;
import com.mybackenexam.backendexam.dto.SaveCategoryDTO;
import com.mybackenexam.backendexam.model.CategoryEntity;
import com.mybackenexam.backendexam.service.intf.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/category")
@RestController
@Slf4j
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<?> insertCategory(@RequestBody SaveCategoryDTO saveCategoryDTO){

      try{
          CategoryEntity category = categoryService.insertCategory(saveCategoryDTO);
          return new ResponseEntity<>(category, HttpStatus.OK);
      }catch (Exception e){
          log.info("Error on saving");
          return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }


    @GetMapping("/all")
    public ResponseEntity<?> getAllCategory(){

        try{
            List<CategoryDTO> categoryDTOList = categoryService.getAllCategory();
            return new ResponseEntity<>(categoryDTOList, HttpStatus.OK);
        }catch (Exception e){
            log.info("Error on getting data");
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
