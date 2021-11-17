package com.webdemo2.config;

import com.webdemo2.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean registerMyFilter(){

        // 注册过滤器
        FilterRegistrationBean filterRegistrationBean =
                new FilterRegistrationBean(new MyFilter());

        // 添加过滤（响应的）页面
        filterRegistrationBean.addUrlPatterns("/user/*");

        return filterRegistrationBean;
    }
}
