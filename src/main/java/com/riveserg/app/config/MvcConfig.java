package com.riveserg.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    private static final String TEMPLATE_PREFIX = "/WEB-INF/views/";
    private static final String HOME_KEY = "home";

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home")
                .setViewName(HOME_KEY);
        registry.addViewController("/")
                .setViewName(HOME_KEY);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                        "/images/**",
                        "/css/**",
                        "/js/**"
                )
                .addResourceLocations(
                        TEMPLATE_PREFIX + "images/",
                        TEMPLATE_PREFIX + "css/",
                        TEMPLATE_PREFIX + "js/"
                );
    }
}
