package com.codeclan.example.employeeService.controllers;

import com.codeclan.example.employeeService.models.Brief;
import com.codeclan.example.employeeService.repositories.BriefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BriefController {

    @Autowired
    BriefRepository briefRepository;

    @GetMapping(value = "/briefs")
    public List<Brief> getAllBriefs(){
        return briefRepository.findAll();
    }
}
