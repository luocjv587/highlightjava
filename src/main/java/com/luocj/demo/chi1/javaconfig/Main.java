package com.luocj.demo.chi1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseBaseService useBaseService = context.getBean(UseBaseService.class);
        useBaseService.doIt();
    }
}
