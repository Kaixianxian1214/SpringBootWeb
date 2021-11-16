package com.webdemo1.controller;

import com.webdemo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestTestController {

    @Autowired
    private StudentService service;

    //1 测试GetMapping
    // @RequestMapping(value = "/stu", method = RequestMethod.GET)
    @GetMapping("stu")
    public Object get(Integer id){
        return service.queryStudentById(id);
    }

    //2 测试PostMapping
    // @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @PostMapping("/insert")
    public Object insert(Integer id){
        return service.queryStudentById(id);
    }

    //3 测试RequestMapping
    // @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @DeleteMapping("delete")
    public Object delete(Integer id){
        return service.queryStudentById(id);
    }

    //4 测试PutMapping
    // @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @PutMapping("update")
    public Object update(Integer id){
        return service.queryStudentById(id);
    }

    //5 测试Restful风格
    @GetMapping("rest/{id}/{name}")
    public Object update(@PathVariable("id") Integer id,
                         @PathVariable("name") String name){
        Map<String, Object> map = new HashMap<>();

        map.put("id", id);
        map.put("name", name);
        return map;
    }
}
