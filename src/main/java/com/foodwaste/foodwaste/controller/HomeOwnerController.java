package com.foodwaste.foodwaste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeOwnerController {

    @GetMapping("/homeowners")
    public String HOC() {
        return "homeowners";
    }

}
