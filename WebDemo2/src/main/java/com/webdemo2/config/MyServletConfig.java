package com.webdemo2.config;

import com.webdemo2.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration   // 表明这是一个配置类
public class MyServletConfig {

    @Bean
    public ServletRegistrationBean registerMyServlet(){
        ServletRegistrationBean servletRegistrationBean =
                new ServletRegistrationBean(new MyServlet(),"/myservlet2");
        // 指定自定义的MyServlet，并且指定相应的路径
        return servletRegistrationBean;
    }


/*    @Bean
    public FilterRegistrationBean characterEncodingFilterRegistrationBean(){

        // 创建字符编码过滤器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        // 设置强制使用指定字符编码
        characterEncodingFilter.setForceEncoding(true);
        // 设置指定的编码格式
        characterEncodingFilter.setEncoding("utf-8");

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        // 设置字符编码过滤器
        filterRegistrationBean.setFilter(characterEncodingFilter);

        // 设置过滤的响应路径  --  /*表示所有的响应
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }*/
}
