package com.soa.project.controller;

import com.soa.project.domain.Person;
import com.soa.project.domain.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/login")
    public String login(){ return "login"; }

    @RequestMapping("/index")
    public String verification(@RequestParam String accounts,String password){

        System.out.println("accounts:"+accounts+",password:"+password);

        long count;

        //step1:verification user accounts is right

        count = personRepository.count(new Specification<Person>(){
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {

                return cb.equal(root.get("accounts"), accounts);
            }
        });

        if(count==0) {
            System.out.println("accounts is not right");
        }

        //step2:verification user password is right
        List<Person> personList = personRepository.findAll(new Specification<Person>(){
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {

                List<Predicate> list = new ArrayList<Predicate>();

                list.add(cb.equal(root.get("accounts"), accounts));

                list.add(cb.equal(root.get("password"), password));

                Predicate[] p = new Predicate[list.size()];

                return cb.and(list.toArray(p));
            }
        });

        if(personList.isEmpty()) {
            System.out.println("password is not right");
        }

        System.out.println("search accounts num:"+personList.size());



        //step2:verification success , into  index page;
        //step3:verification fail , return login page;

        return "index";

    }

}
