package com.luocj.demo.chi1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public BaseService baseService(){
        return  new BaseService();
    }

    @Bean
    public UseBaseService useBaseService(BaseService baseService){
        return  new UseBaseService(baseService);
    }
}
