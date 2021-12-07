package com.miramontes.covidcasestracker.controllers;

import com.miramontes.covidcasestracker.models.LocationStat;
import com.miramontes.covidcasestracker.services.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStat> currentStats = covidDataService.getCurrentStats();
        int totalReportedCases = currentStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        model.addAttribute("locationStats", currentStats);
        model.addAttribute("totalReportedCases", totalReportedCases);

        // This looks up for this html file at templates folder.
        return "home";
    }
}
