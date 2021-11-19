package com.webdemo3.controller;

import com.webdemo3.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogController {

    @Autowired
    private StudentService service;

    @GetMapping("/student/count")
    public String studentCount(){
        log.info("查询当前学生总人数：");

        return "学生总数为" + service.queryStudentCount();
    }
}
