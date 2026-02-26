package com.example.ecommercespring.services;

import com.example.ecommercespring.dto.CategoryDTO;
import com.example.ecommercespring.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service // same as @component object create krt hai for better naming convention service layer hai esliy
public class FakeStoreCategoryService implements ICategoryService{
    private final ICategoryGateway categoryGateway;
    public FakeStoreCategoryService(ICategoryGateway categoryGateway){
        this.categoryGateway=categoryGateway;
    }



    @Override
    public List<CategoryDTO> getAllCategories()throws IOException {
        return this.categoryGateway.getAllCategories();
    }
}
