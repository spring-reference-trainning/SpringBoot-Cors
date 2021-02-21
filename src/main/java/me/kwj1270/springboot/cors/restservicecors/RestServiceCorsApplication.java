package me.kwj1270.springboot.cors.restservicecors;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configurable
public class RestServiceCorsApplication {
/*
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

 */
}
