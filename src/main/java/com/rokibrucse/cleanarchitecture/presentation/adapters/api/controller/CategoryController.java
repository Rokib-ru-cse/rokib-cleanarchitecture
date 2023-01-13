package com.rokibrucse.cleanarchitecture.presentation.adapters.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rokibrucse.cleanarchitecture.domain.entities.Category;
import com.rokibrucse.cleanarchitecture.presentation.adapters.api.interfaces.ICategoryService;
import com.rokibrucse.cleanarchitecture.presentation.adapters.config.exceptionhandler.ApplicationException;
import com.rokibrucse.cleanarchitecture.presentation.adapters.config.returnresponse.ReturnReponse;

@RestController
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/categories")
    public ReturnReponse<Category> categories() {
        return categoryService.categoryList();
    }
    @PostMapping("/categories")
    public ReturnReponse<Category> saveCategory(@RequestBody Category category) throws ApplicationException {
        return categoryService.saveCategory(category);
    }
}
