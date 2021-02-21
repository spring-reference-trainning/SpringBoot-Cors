package me.kwj1270.springboot.cors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CorsApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigure() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:8080");
                // 2개 등록 가능, registry.addMapping("/greeting-javaconfig").allowedOrigins("a", "b");
                // 전체 등록 가능, registry.addMapping("/**").allowedOrigins("*");
                // HTTP 메서드 등록 가능, registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST");
                // preflight 리퀘스트 캐싱(해당 client 재요청시 인증허가), registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST").maxAge(300);
            }
        };
    }
}
