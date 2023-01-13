package com.rokibrucse.cleanarchitecture.presentation.adapters.api.controller;


import com.rokibrucse.cleanarchitecture.application.interfaces.IClassroomUseCase;
import com.rokibrucse.cleanarchitecture.domain.entities.Classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassroomController {

    @GetMapping("/classrooms")
    public String classroomList(Model model) {
        return "";
    }


}
