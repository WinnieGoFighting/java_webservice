package com.ni.service.impl;


import com.ni.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+", welcome to use our web service.";
    }
}
