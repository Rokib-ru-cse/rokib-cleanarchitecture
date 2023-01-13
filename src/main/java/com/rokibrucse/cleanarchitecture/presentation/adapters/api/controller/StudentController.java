package com.rokibrucse.cleanarchitecture.presentation.adapters.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rokibrucse.cleanarchitecture.application.interfaces.IStudentUseCase;

@RestController
public class StudentController {


    @GetMapping("/students")
    public String studentList(Model model) {
       return "";
    }

    @GetMapping("/students/classrooms/{id}")
    public String studentsByRoomId(@PathVariable(value = "id") int id, Model model) {
        return "";
    }

    @GetMapping("/students/courses/{id}")
    public String coursesByStudentId(@PathVariable(value = "id") int id, Model model) {
        return "";
    }
}
