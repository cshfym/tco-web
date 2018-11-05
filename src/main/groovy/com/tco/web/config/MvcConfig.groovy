package com.tco.web.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Configuration
class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index")
        registry.addViewController("/").setViewName("index")
    }

    @Override
    void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
    }

}