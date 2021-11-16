package com.webdemo1.controller;

import com.webdemo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private StudentService service;

    // 对redis写值
    @RequestMapping("/put")
    public Object put(String key, String value){

        service.put(key, value);
        return "put success";
    }

    // 从redis取值
    @GetMapping("get")
    public Object get(String key){

        return service.getByKey(key);
    }
}
