package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(destroyMethod ="destroy") // this is for spring way to do it when it is autoclosable
    public Teacher teacher(){
        return new Teacher();
    }


}
