package com.ni;

import com.ni.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {

    public static void main(String[] args) {
        //服务接口访问地址：http://localhost:8000/ws/hello
        //创建cxf代理工厂，通过接口生成代理对象，再通过代理对象远程访问服务端
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        //设置服务的地址
        factory.setAddress("http://localhost:8000/ws/hello");
        //设置接口类型
        factory.setServiceClass(HelloService.class);
        //对接口生成代理对象
        HelloService serviceProxy = factory.create(HelloService.class);
        //代理对象类型
        //java代理类型：静态代理，动态代理（jdk接口代理，cglib子类代理）
        System.out.println(serviceProxy.getClass());
        //远程访问服务端方法
        String content = serviceProxy.sayHello("Winnie");
        System.out.println(content);
    }
}
