package com.webdemo2.config;

import com.webdemo2.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   // 表明这是一个配置类
public class MyServletConfig {

    @Bean
    public ServletRegistrationBean registerMyServlet(){
        ServletRegistrationBean servletRegistrationBean =
                new ServletRegistrationBean(new MyServlet(),"/myservlet2");
        // 指定自定义的MyServlet，并且指定相应的路径
        return servletRegistrationBean;
    }
}
