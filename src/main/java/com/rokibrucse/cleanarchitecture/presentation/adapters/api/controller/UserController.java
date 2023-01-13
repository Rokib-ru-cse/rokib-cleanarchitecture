package com.rokibrucse.cleanarchitecture.presentation.adapters.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rokibrucse.cleanarchitecture.application.interfaces.IUserUseCase;
import com.rokibrucse.cleanarchitecture.domain.entities.User;


@RestController
public class UserController {

    @GetMapping("/users")
    public String showUserList(Model model) {
        return "";
    }

    @GetMapping("/users/new")
    public String showNewUserForm(Model model) {
        return "";
    }

    @PostMapping("/users")
    public String addusers(User user, RedirectAttributes ra) {
        return "";
    }

    @GetMapping("/users/edit/{id}")
    public String showEditUserForm(@PathVariable("id") int id, Model model, RedirectAttributes ra) {
        return "";
    }

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable("id") int id, RedirectAttributes ra) {
        return "";
    }

}