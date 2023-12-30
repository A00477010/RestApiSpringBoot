package com.restProjectJpa.restproj.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/getAdminDetails")
public class ControllerTrial {
    @GetMapping
    public String trailController(){
        return "This is Admin Detail page ";

    }
}
