package com.webdemo1;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebDemo1Application {

    public static void main(String[] args) {

//        //  获取启动类
//        SpringApplication application = new SpringApplication(WebDemo1Application.class);
//        // 关闭logo
//        application.setBannerMode(Banner.Mode.OFF);
//
//        application.run(args);
        SpringApplication.run(WebDemo1Application.class, args);
    }

}
