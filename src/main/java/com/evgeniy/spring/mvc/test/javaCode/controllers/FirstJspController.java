package com.evgeniy.spring.mvc.test.javaCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/jsp")
public class FirstJspController {
    @GetMapping("/hellojsp")
    public String hello(Model model) {
        model.addAttribute("messageJsp", "Hello Evgeniy");
        return "/hellojsp";
    }

    @GetMapping("/calculator")
    public String calc(@RequestParam(value = "a", required = false) int a,
                       @RequestParam(value = "b", required = false) int b,
                       @RequestParam(value = "action", required = false) String action,
                       Model model) {
        double result;
        switch (action) {
            case "multiplication":
                result = a * b;
                break;
            case "addition":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "division":
                result = a / (double) b;
                break;
            default:
                result = 0;
        }
        model.addAttribute("result", action + " = " + result);
        return "/calculator";
    }
}
