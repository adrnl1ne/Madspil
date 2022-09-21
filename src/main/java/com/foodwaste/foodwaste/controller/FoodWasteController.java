package com.foodwaste.foodwaste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FoodWasteController {


  @GetMapping("/foodwaste")
  public String foodwaste() {
    return "foodwaste";
  }
}

