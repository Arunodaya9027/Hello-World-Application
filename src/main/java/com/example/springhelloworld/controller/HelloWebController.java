package com.example.springhelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
    @GetMapping(path = "/web")
    public String hello() {
        return "hello";
    }

    @GetMapping(path = "/web/message")
    public String message(Model model) {
        model.addAttribute("msg", "This is a custom message");
        return "message";
    }
}
