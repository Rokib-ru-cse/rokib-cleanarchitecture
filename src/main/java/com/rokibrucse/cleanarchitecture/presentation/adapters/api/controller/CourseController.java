package com.rokibrucse.cleanarchitecture.presentation.adapters.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rokibrucse.cleanarchitecture.application.interfaces.ICourseUseCase;

@RestController
public class CourseController {


    @GetMapping("/courses")
    public String courseList(Model model){
        return "";
    }

    @GetMapping("courses/students/{id}")
    public String courseStudentList(@PathVariable("id")int id,Model model){
        return "";
    }
}
