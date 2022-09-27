package com.mybackenexam.backendexam.service.intf;

import com.mybackenexam.backendexam.dto.SaveCategoryDTO;
import com.mybackenexam.backendexam.dto.SaveProductDTO;
import com.mybackenexam.backendexam.model.ProductEntity;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    ProductEntity addProduct(SaveProductDTO saveProductDTO);
}
