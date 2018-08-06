package com.gestordoc.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/home")
    public Model homePage(Model model) {
        model.addAttribute("appName", appName);
        return model;
    }
}

