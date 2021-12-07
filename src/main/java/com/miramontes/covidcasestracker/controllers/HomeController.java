package com.miramontes.covidcasestracker.controllers;

import com.miramontes.covidcasestracker.services.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStats", covidDataService.getCurrentStats());

        // This looks up for this html file at templates folder.
        return "home";
    }
}
