package com.rokibrucse.cleanarchitecture.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.rokibrucse.cleanarchitecture.domain.model.Classroom;

public interface IClassroomRepository extends CrudRepository<Classroom,Integer> {
}
