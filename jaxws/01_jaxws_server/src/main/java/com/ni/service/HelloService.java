package com.ni.service;

import javax.jws.WebService;

/**
 * 是对外发布服务的接口
 */
@WebService
public interface HelloService {
    public String sayHello(String name);
}
