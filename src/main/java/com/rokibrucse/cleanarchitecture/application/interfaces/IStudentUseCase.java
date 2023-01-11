package com.rokibrucse.cleanarchitecture.application.interfaces;

import org.springframework.stereotype.Component;
import com.rokibrucse.cleanarchitecture.domain.model.Student;

import java.util.List;
import java.util.Optional;

@Component
public interface IStudentUseCase {
    public List<Student> studentList();

    public List<Student> studentListByClassroomId(int id);

    public Optional<Student> coursesListByStudentId(int id);
}
