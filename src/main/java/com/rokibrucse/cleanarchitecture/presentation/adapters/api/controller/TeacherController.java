package com.rokibrucse.cleanarchitecture.presentation.adapters.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rokibrucse.cleanarchitecture.application.interfaces.ITeacherUseCase;
import com.rokibrucse.cleanarchitecture.domain.entities.Teacher;

import java.util.List;
@RestController
public class TeacherController {

    @GetMapping("/teachers")
    public String teachers(Model model){
        return "";
    }
}
