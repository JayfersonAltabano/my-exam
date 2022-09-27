package com.mybackenexam.backendexam.service.intf;

import com.mybackenexam.backendexam.dto.CategoryDTO;
import com.mybackenexam.backendexam.dto.SaveCategoryDTO;
import com.mybackenexam.backendexam.model.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {


     List<CategoryDTO> getAllCategory();

    CategoryEntity insertCategory(SaveCategoryDTO saveCategoryDTO);
}
