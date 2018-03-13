package com.soa.project.service;


import com.soa.project.domain.Project;
import com.soa.project.domain.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    /**
     * search project list
     * return string
     */
    @RequestMapping("/service/getProjectList")
    public List<Project> getProjectList(){

        return projectRepository.findAll();
    }


    /**
     * create a project
     */

    public String createProject(){

        return UUID.randomUUID().toString();


    }
}
