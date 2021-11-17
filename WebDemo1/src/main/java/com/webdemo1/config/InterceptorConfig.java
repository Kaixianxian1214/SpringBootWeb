package com.webdemo1.config;

import com.webdemo1.interceptor.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 拦截/person下的所有请求
        // 但是这样的拦截的路径中的有一些是不需要用户登陆也可访问的
        String[] addPathPatterns = {
                "/person/**"
        };
        // 要排除的路径，排除的路径说明用户不需要登陆也可以访问
        String[] excludePathPatterns = {
                "/person/out",
                "/person/trans",
                "/person/login"
        };

        registry.addInterceptor(new Interceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
