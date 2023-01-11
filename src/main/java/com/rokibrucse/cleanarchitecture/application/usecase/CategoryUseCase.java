package com.rokibrucse.cleanarchitecture.application.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rokibrucse.cleanarchitecture.application.interfaces.ICategoryUseCase;
import com.rokibrucse.cleanarchitecture.application.repository.ICategoryRepository;
import com.rokibrucse.cleanarchitecture.domain.model.Category;

import java.util.List;

@Service
public class CategoryUseCase implements ICategoryUseCase {

    @Autowired
    private ICategoryRepository categoryRepo;

    public List<Category> categoryList() {
        return (List<Category>) categoryRepo.findAll();
    }

    public void save(Category category) {
        categoryRepo.save(category);
    }
}
