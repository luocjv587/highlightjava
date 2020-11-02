package com.luocj.demo.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * 服务是否使用单例或者and so on 49页
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService demoSingletonService = context.getBean(DemoSingletonService.class);
        DemoPrototypeService demoPrototypeService = context.getBean(DemoPrototypeService.class);

        DemoSingletonService demoSingletonService1 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);

        System.out.println("demoSingletonService demoSingletonService1 是否相等" + demoSingletonService.equals(demoSingletonService1));
        System.out.println("demoPrototypeService demoPrototypeService1 是否相等" + demoPrototypeService.equals(demoPrototypeService1));
    }
}
