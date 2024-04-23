package com.example.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeApplication.class, args);
    }

    /*
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/createRoom").allowedOrigins("http://localhost:3000");
                registry.addMapping("/sendMessage").allowedOrigins("http://localhost:3000");
                registry.addMapping("/listByRoomName").allowedOrigins("http://localhost:3000");
                registry.addMapping("/getRoom").allowedOrigins("http://localhost:3000");
                registry.addMapping("/listRooms").allowedOrigins("http://localhost:3000");
                registry.addMapping("/listRooms").allowedOrigins("*");
            }
        };
    }

     */
}
