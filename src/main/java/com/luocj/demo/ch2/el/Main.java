package com.luocj.demo.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resouceService = context.getBean(ElConfig.class);
        resouceService.outputReasource();
        context.close();
    }
}
