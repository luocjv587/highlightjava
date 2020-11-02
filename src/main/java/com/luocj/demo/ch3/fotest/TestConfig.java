package com.luocj.demo.ch3.fotest;

import com.luocj.demo.ch3.annotation.WiselyConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@WiselyConfiguration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("from dev profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return  new TestBean("from production profile");

    }
}
