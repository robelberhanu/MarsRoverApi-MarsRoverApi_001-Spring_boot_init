package com.example.marseroverapi.web;

import com.example.marseroverapi.response.MarsRoverApiResponse;
import com.example.marseroverapi.service.MarsRoverApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired // object below is managed by spring. please provide
    private MarsRoverApiService roverService;
    
    @GetMapping("/")
    public String getHome(ModelMap model){
        MarsRoverApiResponse roverData = roverService.getRoverData();
        model.put("roverData", roverData);
        return "index";
    }
}
