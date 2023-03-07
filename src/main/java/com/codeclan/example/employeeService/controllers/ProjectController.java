package com.codeclan.example.employeeService.controllers;

import com.codeclan.example.employeeService.models.Brief;
import com.codeclan.example.employeeService.models.Project;
import com.codeclan.example.employeeService.repositories.BriefRepository;
import com.codeclan.example.employeeService.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value = "/projects")
    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }
}
