package com.rokibrucse.cleanarchitecture.application.interfaces;

import org.springframework.stereotype.Component;

import com.rokibrucse.cleanarchitecture.domain.model.Category;

import java.util.List;

@Component
public interface ICategoryUseCase {
    List<Category> categoryList();
    void save(Category category);
}
