package com.soa.project.controller;

import com.soa.project.domain.Person;
import com.soa.project.domain.PersonRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/login")
    public String login(){ return "login"; }

    @RequestMapping("/index")
    public String verification(@ModelAttribute Person person, Model model){

        logger.info("accounts:{},password:{}",person.getAccounts(),person.getPassword());

        long count;

        //step1:verification user accounts

        count = personRepository.count(new Specification<Person>(){
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {

                return cb.equal(root.get("accounts"), person.getAccounts());
            }
        });

        if(count==0) {
            model.addAttribute("accounts", person.getAccounts());
            model.addAttribute("accountsError", "accounts incorrect");
            return "login";
        }

        //step2:verification user password

        List<Person> personList = personRepository.findAll(new Specification<Person>(){
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {

                List<Predicate> list = new ArrayList<Predicate>();

                list.add(cb.equal(root.get("accounts"), person.getAccounts()));

                list.add(cb.equal(root.get("password"), person.getPassword()));

                Predicate[] p = new Predicate[list.size()];

                return cb.and(list.toArray(p));
            }
        });

        if(personList.isEmpty()) {
            model.addAttribute("accounts", person.getAccounts());
            model.addAttribute("password", person.getPassword());
            model.addAttribute("passwordError", "password incorrect");
            return "login";
        }


        //step2:verification success , into  index page;

        return "index";

    }

}
