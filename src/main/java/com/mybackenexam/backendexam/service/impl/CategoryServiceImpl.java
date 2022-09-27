package com.mybackenexam.backendexam.service.impl;

import com.mybackenexam.backendexam.dto.CategoryDTO;
import com.mybackenexam.backendexam.dto.SaveCategoryDTO;
import com.mybackenexam.backendexam.model.CategoryEntity;
import com.mybackenexam.backendexam.repository.CategoryRepository;
import com.mybackenexam.backendexam.service.intf.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryDTO> getAllCategory(){
        //get all category
        List<CategoryEntity> categoryEntityList = categoryRepository.findAll();

        //map to DTO
        List<CategoryDTO> categoryDTOS = new ArrayList<>();
        for (CategoryEntity categoryEntity : categoryEntityList) {

            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(categoryEntity.getId());
            categoryDTO.setName(categoryEntity.getName());
            categoryDTOS.add(categoryDTO);
        }

        //return list of DTOs
        return categoryDTOS;
    }

    @Override
    public CategoryEntity insertCategory(SaveCategoryDTO saveCategoryDTO){

        //set value of category entity
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName(saveCategoryDTO.getName());
        categoryEntity.setCreatedBy("ADMIN");
        categoryEntity.setCreatedDate(new Date());

        return categoryRepository.save(categoryEntity);

    }
}
