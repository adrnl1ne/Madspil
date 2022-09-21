package com.foodwaste.foodwaste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessController {

    @GetMapping("/business")
    public String businessOwner(){
        return "business";
    }
}
