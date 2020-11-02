package com.luocj.demo.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublish demoPublish = context.getBean(DemoPublish.class);
        demoPublish.publish("hello application event");
        context.close();
    }
}
