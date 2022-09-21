package com.foodwaste.foodwaste.controller;
import org.springframework.web.bind.annotation.GetMapping;



@org.springframework.stereotype.Controller

public class HomeController {

    //Syntax to implement a
    //GET method
    @GetMapping("/")
    public String home() {
        return "index";
    }

    public String organization(){return "organization"; }


}
