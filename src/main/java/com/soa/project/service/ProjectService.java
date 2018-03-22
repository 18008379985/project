package com.soa.project.service;


import com.soa.project.domain.Project;
import com.soa.project.domain.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.util.*;

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
     * search project by name
     * return string
     */
    @RequestMapping(value = "/service/findProject",method = RequestMethod.POST)
    public List<Project> findProjectByName(@RequestParam String projectName){

        return projectRepository.findAll(new Specification<Project>() {
            @Override
            public Predicate toPredicate(Root<Project> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

                return cb.like(root.get("projectName"), projectName);

            }
        });
    }

    /**
     * search project by type
     * return string
     */
    @RequestMapping(value = "/service/findProjectByType",method = RequestMethod.POST)
    public List<Project> findProjectByType(@RequestParam String projectType){

        return projectRepository.findAll(new Specification<Project>() {
            @Override
            public Predicate toPredicate(Root<Project> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

                return cb.equal(root.get("typeCode"), projectType);

            }
        });
    }


    /**
     * create a project
     */

    public String createProject(){

        return UUID.randomUUID().toString();


    }
}
