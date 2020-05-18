package com.ni.service;

import javax.jws.WebService;

/**
 * 通过wsdl说明文档写接口
 */
@WebService
public interface HelloService {
    public String sayHello(String name);
}

