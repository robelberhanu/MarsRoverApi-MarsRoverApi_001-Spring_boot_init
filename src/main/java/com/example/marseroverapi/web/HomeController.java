package com.example.marseroverapi.web;

import com.example.marseroverapi.response.MarsRoverApiResponse;
import com.example.marseroverapi.service.MarsRoverApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.util.StringUtils;

@Controller
public class HomeController {

    @Autowired // object below is managed by spring. please provide
    private MarsRoverApiService roverService;
    
    @GetMapping("/")
    public String getHome(ModelMap model,  @RequestParam (required = false)String marsApiRoverData){
        //if request param is empty, then set a default value
        if(StringUtils.isEmpty(marsApiRoverData)){
            marsApiRoverData = "opportunity";
        }
        MarsRoverApiResponse roverData = roverService.getRoverData(marsApiRoverData);
        model.put("roverData", roverData);
        return "index";
    }


    }

