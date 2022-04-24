package com.coderscampus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Controller listens for incoming requests and take the requests and execute code.
public class HomeController {

    @GetMapping("/")
    public String getHomeView(){
        return "index";
    }
    
}
 