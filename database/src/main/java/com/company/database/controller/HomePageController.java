package com.company.database.controller;

import com.company.database.entity.Employees;
import com.company.database.services.EmployeesService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.List;

@Controller
public class HomePageController {

    private EmployeesService employeesService;

    public HomePageController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    // this deletes all white spaces in String's which are send back from html forms
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }


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

    @GetMapping("/employeeList")
    public String employeeList(Model theModel) {

        List<Employees> employeesList = employeesService.findAll();

        theModel.addAttribute("employeesList", employeesList);

        return "employee-list";
    }
}
