package com.rokibrucse.cleanarchitecture.application.interfaces;

import org.springframework.stereotype.Component;

import com.rokibrucse.cleanarchitecture.domain.model.Teacher;

import java.util.List;

@Component
public interface ITeacherUseCase {

    public List<Teacher> teacherList();
}
