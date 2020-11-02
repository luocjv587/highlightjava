package com.luocj.demo.ch1.javaconfig;

public class UseBaseService {
    private BaseService baseService;

    public UseBaseService(BaseService baseService) {
        this.baseService = baseService;
    }

    public void doIt(){
        baseService.doIt();
    }
}
