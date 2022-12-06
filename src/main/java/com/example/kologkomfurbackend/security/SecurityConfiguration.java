package com.example.kologkomfurbackend.security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@AllArgsConstructor
public class SecurityConfiguration implements WebMvcConfigurer {


//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        System.out.println("addCorsMappings called");
//        registry.addMapping("/**")  // /** means match any string recursively
//                .allowedOriginPatterns("*") //Multiple strings allowed. Wildcard * matches all port numbers.
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS") // decide which methods to allow
//                .allowCredentials(true);
//    }

}
