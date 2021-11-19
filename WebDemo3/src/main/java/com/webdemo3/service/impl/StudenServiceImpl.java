package com.webdemo3.service.impl;

import com.webdemo3.dao.StudentMapper;
import com.webdemo3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudenServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Integer queryStudentCount() {
        return studentMapper.selectStudentCount();
    }
}
