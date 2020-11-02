package com.luocj.demo.chi1.javaconfig;

public class UseBaseService {
    private BaseService baseService;

    public UseBaseService(BaseService baseService) {
        this.baseService = baseService;
    }

    public void doIt(){
        baseService.doIt();
    }
}
