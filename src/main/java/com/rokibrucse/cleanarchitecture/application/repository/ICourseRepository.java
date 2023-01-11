package com.rokibrucse.cleanarchitecture.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.rokibrucse.cleanarchitecture.domain.model.Course;

public interface ICourseRepository extends CrudRepository<Course,Integer> {
}
