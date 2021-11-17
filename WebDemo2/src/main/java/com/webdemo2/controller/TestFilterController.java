package com.webdemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFilterController {

    @GetMapping("/user/home")
    public Object user(){

        return "user pages";
    }

    @GetMapping("/center")
    public Object center(){

        return "center pages";
    }


}
