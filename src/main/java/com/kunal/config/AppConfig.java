package com.kunal.config;

import com.kunal.Laptop;
import com.kunal.Programmer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.kunal")
public class AppConfig {


//    public Programmer programmer()
//    {
//        return  new Programmer();
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
