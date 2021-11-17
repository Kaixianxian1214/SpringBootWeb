package com.webdemo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class WarController {

    @RequestMapping("/user/detail")
    @ResponseBody
    public Object userDetail(){

        Map<String, Object> map = new HashMap<>();
        map.put("id", 1678);
        map.put("nickname", "hanhan");

        return map;
    }

    @RequestMapping("/user/page/detail")
    public String userPageDetail(Model model){
        model.addAttribute("id", 1234);
        model.addAttribute("nickname","hanhancxy");
        return "userDetail";
    }
}
