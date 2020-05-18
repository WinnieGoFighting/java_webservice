package com.ni;

import com.ni.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Client {

    //注入对象
    @Resource
    private HelloService serviceProxy;

    @Test
    public void run() {
        System.out.println(serviceProxy.getClass());
        String content = serviceProxy.sayHello("Peter");
        System.out.println(content);
    }
}
