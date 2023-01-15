package com.rokibrucse.cleanarchitecture.presentation.adapters.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rokibrucse.cleanarchitecture.domain.entities.Category;
import com.rokibrucse.cleanarchitecture.presentation.adapters.config.exceptionhandler.ApplicationException;
import com.rokibrucse.cleanarchitecture.presentation.adapters.config.returnresponse.ReturnReponse;

import jakarta.validation.Valid;

@RestController
public class CategoryController {

    @GetMapping("/categories")
    public ReturnReponse<Category> categories() {
        return null;
    }

    @PostMapping("/categories")
    public ReturnReponse<Category> saveCategory(@Valid @RequestBody Category category) throws ApplicationException {
        return null;
    }
}
