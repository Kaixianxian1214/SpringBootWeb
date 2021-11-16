package com.webdemo1.service;

import com.webdemo1.model.Student;

public interface StudentService {

    public Student queryStudentById(Integer id);

    public int updateStudentById(Student student);

    public void put(String key, String value);

    public Object getByKey(String key);
}
