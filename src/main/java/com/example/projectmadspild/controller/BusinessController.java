package com.example.projectmadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessController {
    @GetMapping("/Business")
    public String businessOwner(){
        return "business";
    }
}
