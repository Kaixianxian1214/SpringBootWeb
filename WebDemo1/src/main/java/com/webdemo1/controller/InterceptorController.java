package com.webdemo1.controller;

import com.webdemo1.config.Person;
import com.webdemo1.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/person")
public class InterceptorController {

    // 用户登陆请求
    @GetMapping("/login")
    public Object login(HttpServletRequest request){
        // 将用户信息存放到session
        Student student = new Student();
        student.setName("hanhan");
        student.setAge(22);
        student.setId(1678);

        request.getSession().setAttribute("student", student);
        return "Login SUCCESS";
    }

    // 用户需登陆可访问/center
    @GetMapping("/center")
    public Object center(){
        return "See center message";
    }

    //用户无需登陆可访问/out
    @GetMapping("/out")
    public Object noLogin(){
        return "no Login pages";
    }

    // 如果用户未登录访问了需要登陆才可访问的请求会跳转到该请求路径
    // 用户无需登陆也可访问
    @GetMapping("/trans")
    public Object transPages(){
        return "transPages";
    }
}
