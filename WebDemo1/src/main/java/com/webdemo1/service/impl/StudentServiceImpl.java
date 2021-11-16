package com.webdemo1.service.impl;

import com.webdemo1.dao.StudentMapper;
import com.webdemo1.model.Student;
import com.webdemo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired // 注入成员变量
    private StudentMapper studentMapper;

    @Override // 查询数据库信息
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override // 修改数据库信息
    public int updateStudentById(Student student) {

        int i = studentMapper.updateByPrimaryKeySelective(student);
        // 出现异常
        int a = 10/0;
        return i;
    }

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override //  往redis存储
    public void put(String key, String value) {

        redisTemplate.opsForValue().set(key, value);
    }

    @Override // 从redis获取值
    public Object getByKey(String key) {

        return redisTemplate.opsForValue().get(key);
    }
}
