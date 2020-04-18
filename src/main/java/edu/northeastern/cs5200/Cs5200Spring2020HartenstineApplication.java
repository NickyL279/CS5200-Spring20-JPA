package edu.northeastern.cs5200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

//import org.springframework.boot.web.support.SpringBootServletInitializer;
//if you face an error with above imports, try

@SpringBootApplication
public class Cs5200Spring2020HartenstineApplication
        extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder
  configure(SpringApplicationBuilder application) {
    return application.sources(
            Cs5200Spring2020HartenstineApplication.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(
            Cs5200Spring2020HartenstineApplication.class, args);
  }

}
