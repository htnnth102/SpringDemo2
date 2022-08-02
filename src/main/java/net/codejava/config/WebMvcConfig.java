package net.codejava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("net.codejava")
public class WebMvcConfig {
    @Bean(name="viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver vR = new InternalResourceViewResolver();
        vR.setPrefix("WEB-INF/view/");
        vR.setSuffix(".jsp");
        return vR;
    }
}
