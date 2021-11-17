package com.webdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = {"com.webdemo2.servlet", "com.webdemo2.filter"})
public class WebDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(WebDemo2Application.class, args);
    }

}
