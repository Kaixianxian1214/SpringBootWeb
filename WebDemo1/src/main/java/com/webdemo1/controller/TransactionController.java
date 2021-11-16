package com.webdemo1.controller;

import com.webdemo1.model.Student;
import com.webdemo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TransactionController {

    @Autowired
    private StudentService service;

    @Transactional // 表示是事务
    @RequestMapping("/student/update")
    @ResponseBody
    public Object updateStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("zhangsan");
        service.updateStudentById(student);
        return "";
    }
}
