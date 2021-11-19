package com.webdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ServletComponentScan(basePackages = {"com.webdemo2.servlet", "com.webdemo2.filter"})
public class WebDemo2Application extends SpringBootServletInitializer{

    public static void main(String[] args){
        SpringApplication.run(WebDemo2Application.class, args);
    }

    @Override // 打包需重写该方法
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        // 参数为当前springboot启动类
        // 构造新资源
        return builder.sources(WebDemo2Application.class);
    }
}
