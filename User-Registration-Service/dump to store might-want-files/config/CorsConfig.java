package com.CloudVoyage.UserRegistrationService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
    	System.out.println("OPENNNNN CORSSSSSS");
        registry.addMapping("/actuator/api/hello") // Adjust the mapping as needed
        .allowedOrigins("http://localhost:4200") // Replace with your Angular frontend's URL
        .allowedMethods("GET", "POST", "PUT", "DELETE")
        .allowedHeaders("*")
        .allowCredentials(true);
        
        System.out.println(registry.toString());
    }
}