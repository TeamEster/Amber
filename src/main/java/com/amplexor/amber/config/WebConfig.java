package com.amplexor.amber.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//registry.addViewController("/login").setViewName("templates/login");
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/libs/**").addResourceLocations("/libs/");
//		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
//		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
//		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
	}
}