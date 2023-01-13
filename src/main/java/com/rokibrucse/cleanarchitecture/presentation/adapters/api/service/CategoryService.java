package com.rokibrucse.cleanarchitecture.presentation.adapters.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rokibrucse.cleanarchitecture.application.interfaces.ICategoryUseCase;
import com.rokibrucse.cleanarchitecture.domain.entities.Category;
import com.rokibrucse.cleanarchitecture.domain.validation.Validation;
import com.rokibrucse.cleanarchitecture.presentation.adapters.api.interfaces.ICategoryService;
import com.rokibrucse.cleanarchitecture.presentation.adapters.config.exceptionhandler.ApplicationException;
import com.rokibrucse.cleanarchitecture.presentation.adapters.config.returnresponse.ReturnReponse;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryUseCase categoryUseCase;

    /*
     * (non-Javadoc)
     * 
     * @see com.rokibrucse.cleanarchitecture.presentation.adapters.api.interfaces.
     * ICategoryService#categoryList()
     */
    @Override
    public ReturnReponse<Category> categoryList() {
        List<Category> categories = categoryUseCase.categoryList();
        return ReturnReponse.<Category>builder().message("Data Got Successfully").succeeded(true).values(categories)
                .build();
    }

    @Override
    public ReturnReponse<Category> saveCategory(Category category) throws ApplicationException {

        String validationResult = Validation.categoryValdiation(category, true);
        if (!validationResult.isBlank()) {
            throw new ApplicationException(validationResult);
        }
        Category category2 = categoryUseCase.save(category);
        return ReturnReponse.<Category>builder().message("Data Got Successfully").succeeded(false).value(category2)
                .build();
    }

}
