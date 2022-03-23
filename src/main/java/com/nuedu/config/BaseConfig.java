package com.nuedu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.filter.CorsFilter;
import sun.plugin.dom.core.CoreConstants;

//就是放在ioc容器中
@Configuration
public class BaseConfig {
//弄一个过滤器，解决跨域问题
    @Bean
   public CorsFilter corsFilter(){
       UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
       CorsConfiguration configuration=new CorsConfiguration();
       configuration.addAllowedOrigin("*");
       configuration.addAllowedHeader("*");
       configuration.addAllowedMethod("*");
       source.registerCorsConfiguration("/**",configuration);
       return new CorsFilter(source);
   }


}
