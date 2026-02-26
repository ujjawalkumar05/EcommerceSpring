package com.example.ecommercespring.controllers;

import com.example.ecommercespring.dto.CategoryDTO;
import com.example.ecommercespring.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController //esme @component and @controller +@ResponseBodydoy ka features hai kyuki ye response v deta hai
@RequestMapping("/api/categories")
public class CategoryController {
    private final ICategoryService categoryService;
    CategoryController(ICategoryService categoryService){
        this.categoryService =categoryService;
    }
    @GetMapping
    public List<CategoryDTO>getAllCategories() throws IOException {
        return this.categoryService.getAllCategories();
    }
}

