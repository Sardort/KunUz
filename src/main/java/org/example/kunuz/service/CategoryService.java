package org.example.kunuz.service;

import org.example.kunuz.dto.CategoryDto;
import org.example.kunuz.model.Category;
import org.example.kunuz.model.Result;
import org.example.kunuz.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    //getAll
    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    //getById
    public Category getById(Integer id){
        return categoryRepository.findById(id).get();
    }

    //create
    public Result create(CategoryDto categoryDto){
        Category category = new Category();
        category.setOrder_number(categoryDto.getOrder_number());
        category.setName_uz(categoryDto.getName_uz());
        category.setName_ru(categoryDto.getName_ru());
        category.setName_en(categoryDto.getName_en());
        category.setVisible(categoryDto.getVisible());
        category.setCreated_date(categoryDto.getCreated_date());
        categoryRepository.save(category);
        return new Result(true, "Saqlandi");
    }

    //update
    public Result update(Integer id, CategoryDto categoryDto){
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        if (categoryOptional.isPresent()){
            Category category = categoryOptional.get();
            category.setOrder_number(categoryDto.getOrder_number());
            category.setName_uz(categoryDto.getName_uz());
            category.setName_ru(categoryDto.getName_ru());
            category.setName_en(categoryDto.getName_en());
            category.setVisible(categoryDto.getVisible());
            category.setCreated_date(categoryDto.getCreated_date());
            categoryRepository.save(category);
            return new Result(true,"O'zgartirildi");
        }
        return new Result(false,"Not found");
    }

    //delete
    public Result delete(Integer id){
        categoryRepository.deleteById(id);
        return new Result(true,"O'chirildi");
    }
}
