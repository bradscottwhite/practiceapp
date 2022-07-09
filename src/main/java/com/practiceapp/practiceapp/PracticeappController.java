package com.practiceapp.practiceapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class PracticeappController {
    
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/health")
    public String getHealthCheck() { return "Howdy!"; }


}
