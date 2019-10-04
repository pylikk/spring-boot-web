package net.guides.springboot2.springboot2webappthymeleaf.controllers;

import net.guides.springboot2.springboot2webappthymeleaf.domain.User;
import net.guides.springboot2.springboot2webappthymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String getListUser(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "list";
    }

    @GetMapping("{id}")
    public String getUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.findOne(id));
        return "getUserId";
    }

    @GetMapping("/savePage")
    public String savePage(User user, Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @PostMapping("/saveUser")
    public String saveUser(User user) {
        userService.saveUser(user);
        return "redirect:/list";
    }

}
