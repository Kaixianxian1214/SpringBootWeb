package com.webdemo4.controller;

import com.webdemo4.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    @RequestMapping("/user/message")
    public String message(Model model){

        model.addAttribute("data", "hello hanhancxy");

        return "message";
    }

    @RequestMapping("/user/detail")
    public ModelAndView userDetail(){

        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setAge(23);
        user.setId(1678);
        user.setName("hanhan");

        mv.addObject(user);
        mv.setViewName("userDetail");

        return mv;
    }

    @RequestMapping("/property")
    public String urlExpression(Model model){

        return "property";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String testProperty(Integer id, String name, Integer age){
        return "用户的信息为："+"id："+id+"，姓名："+name+"，年龄："+age;
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<User> userList  = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            User user = new User();
            user.setName("hanhan" + i);
            user.setId(1000 + i);
            user.setAge(i + 20);
            userList.add(user);
        }
        model.addAttribute(userList);
        return "userList";
    }
}
