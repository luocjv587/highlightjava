package com.luocj.demo.ch3.conditional;


import org.springframework.stereotype.Service;

@Service
public class LinuxListService implements ListService {

    public String showListCmd(){
        return "ls";
    }
}
