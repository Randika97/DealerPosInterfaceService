package com.integration.rest.config.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebConfiguration implements WebMvcConfigurer {

    @Autowired
    private GeneralPurporseInterceptor generalPurposeInterceptor;
    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        registry.addInterceptor(generalPurposeInterceptor);
    }
}


