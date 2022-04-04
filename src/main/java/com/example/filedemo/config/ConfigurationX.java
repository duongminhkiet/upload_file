package com.example.filedemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.filedemo.config.beanx.B1ITF;
import com.example.filedemo.config.beanx.B1Impl;

@Configuration
public class ConfigurationX {
	
//	@Bean(name="child2")
//    @Scope("prototype")
	@Bean
	@Scope("prototype")
    public B1ITF item1() {
        return new B1Impl();
    }

}
