package com.webdemo1.controller;

import com.webdemo1.config.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Value("${schoolId}")
    private String schoolId;

    @Autowired
    private Person person;

    @RequestMapping("/say1") // model & view合并一起
    @ResponseBody
    public ModelAndView say(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "hello, springBoot!");
        modelAndView.setViewName("say");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/person")
    public Person printPerson(){
        return person;
    }
}
