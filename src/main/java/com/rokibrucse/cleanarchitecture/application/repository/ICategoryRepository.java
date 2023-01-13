package com.rokibrucse.cleanarchitecture.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.rokibrucse.cleanarchitecture.domain.entities.Category;

public interface ICategoryRepository extends CrudRepository<Category,Integer> {
}
