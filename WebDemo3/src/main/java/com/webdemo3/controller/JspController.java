package com.webdemo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JspController {

    @RequestMapping("/detail")
    public String detail(){
        return "detail";
    }

    @RequestMapping("detai")
    @ResponseBody
    public String show(){
        return "show";
    }
}
