package edu.northeastern.cs5200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

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

  @Bean
  public FilterRegistrationBean<CorsFilter> corsFilter() {
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(true);
    config.addAllowedOrigin("*");
    config.addAllowedHeader("*");
    config.addAllowedMethod("*");
    source.registerCorsConfiguration("/**", config);
    FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
    bean.setOrder(0);
    return bean;
  }

}
