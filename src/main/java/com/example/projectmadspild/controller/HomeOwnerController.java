package com.example.projectmadspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.stereotype.Controller
public class HomeOwnerController {

    @GetMapping("/HO")
    public String HOC() {
        return "homeowners";
    }

}
