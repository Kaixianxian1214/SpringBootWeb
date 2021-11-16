package com.webdemo1.controller;

import com.webdemo1.model.Student;
import com.webdemo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/student")
    public Student selectStudent(Integer id){
        Student student = studentService.queryStudentById(id);
        return student;
    }
}
