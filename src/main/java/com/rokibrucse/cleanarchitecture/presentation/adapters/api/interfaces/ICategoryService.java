package com.rokibrucse.cleanarchitecture.presentation.adapters.api.interfaces;

import com.rokibrucse.cleanarchitecture.domain.entities.Category;
import com.rokibrucse.cleanarchitecture.presentation.adapters.config.exceptionhandler.ApplicationException;
import com.rokibrucse.cleanarchitecture.presentation.adapters.config.returnresponse.ReturnReponse;

public interface ICategoryService {

    ReturnReponse<Category> categoryList();
    ReturnReponse<Category> saveCategory(Category category) throws ApplicationException;
}
