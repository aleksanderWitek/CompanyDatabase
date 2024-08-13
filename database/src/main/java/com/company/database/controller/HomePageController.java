package com.company.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/signInForm")
    public String signInForm() {
        return "sign-in-form";
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }

    @GetMapping("/career")
    public String career() {
        return "career";
    }

    @GetMapping("/employeeInfo")
    public String employeeInfo() {
        return "employee-info";
    }
}
