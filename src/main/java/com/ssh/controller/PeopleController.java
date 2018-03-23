package com.ssh.controller;

import com.ssh.dto.People;
import com.ssh.dto.User;
import com.ssh.service.IPeopleService;
import com.ssh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class PeopleController {

    @Resource(name = "peopleServiceImp")
    IPeopleService peopleService;

    @Autowired
    IUserService userService;

    @PostMapping("/add")
    public String addPeople(People people){
        int id = peopleService.addPeople(people);
        System.out.println(id);
        return "success";
    }

    @PostMapping("/login")
    public String login(User user){
        User user1 = userService.find(user);
        if (user1==null){

            return "login";
        }else{
            return "success";
        }
    }
}
