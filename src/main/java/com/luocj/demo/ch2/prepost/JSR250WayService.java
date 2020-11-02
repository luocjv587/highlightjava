package com.luocj.demo.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    //在构造函数构造之后执行
    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    //在bean销毁之前执行
    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
