package com.soa.project.controller;


import com.soa.project.domain.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectsController {


    @Autowired
    private ProjectRepository projectsRepository;

    @RequestMapping("/list")
    public String showProjectList(){

        return "projectList";

    }

}
