package com.rokibrucse.cleanarchitecture.application.usecase.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rokibrucse.cleanarchitecture.application.repository.ICategoryRepository;
import com.rokibrucse.cleanarchitecture.application.usecase.ICategoryUseCase;
import com.rokibrucse.cleanarchitecture.domain.entities.Category;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryUseCase implements ICategoryUseCase {
    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return (List<Category>) categoryRepository.findAll();
    }

    public Category getCategoryById(int id) {
        return categoryRepository.findById(id).get();
    }

    public Category createCategory(String name) {
        Category category = Category.builder().name(name).build();
        return categoryRepository.save(category);
    }

    public Category updateCategory(int id, String name) {
        Category category = categoryRepository.findById(id).get();
        category.setName(name);
        return categoryRepository.save(category);
    }

    public void deleteCategory(int id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> categoryList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Category save(Category category) {
        // TODO Auto-generated method stub
        return null;
    }
}