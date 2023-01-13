package com.rokibrucse.cleanarchitecture.application.interfaces;

import org.springframework.stereotype.Component;

import com.rokibrucse.cleanarchitecture.domain.entities.User;

import java.util.List;

@Component
public interface IUserUseCase {

    List<User> listAll();

    void saveUser(User user);

    User getById(int id);

    void deleteUser(int id);
}
