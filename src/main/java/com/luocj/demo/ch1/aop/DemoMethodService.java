package com.luocj.demo.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
    public void add(){
        System.out.println("do add");
    }
}
