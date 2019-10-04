package net.guides.springboot2.springboot2webappthymeleaf.service;

import net.guides.springboot2.springboot2webappthymeleaf.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User findOne(Long id);

    String saveUser(User user);

    void deleteUser(Long id);

}


