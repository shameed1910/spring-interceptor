package com.example.interceptor.springinterceptors.config;

import com.example.interceptor.springinterceptors.interceptor.GeneralInterceptor;
import com.example.interceptor.springinterceptors.interceptor.OrderInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired

    private GeneralInterceptor generalInterceptor;

    @Autowired
    private OrderInterceptor orderInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(generalInterceptor).addPathPatterns("/products/**");
        registry.addInterceptor(orderInterceptor).addPathPatterns("/orders/**").excludePathPatterns("/orders/total");

    }
}
