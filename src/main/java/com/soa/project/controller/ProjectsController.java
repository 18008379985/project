package com.soa.project.controller;


import com.soa.project.domain.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/projects")
public class ProjectsController {


    @Autowired
    private ProjectsRepository projectsRepository;

    @RequestMapping("/list")
    public String showProjectList(){

        return "projectList";


    }

}
