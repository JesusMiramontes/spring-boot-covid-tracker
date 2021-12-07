package com.miramontes.covidcasestracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        // This looks up for this html file at templates folder.
        return "home";
    }
}
