package com.ni;

import ni.domain.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

public class client {
    @Test
    public void testSave() {
        User u = new User();
        u.setUsername("huahua");
        u.setCity("guangzhou");
        //通过WebClient对象远程调用服务
        WebClient
                .create("http://localhost:8888/ws/userService/user")
                .type(MediaType.APPLICATION_JSON)//指定请求的数据格式为json
                .post(u);
    }

    @Test
    public void testGet() {
        User u = WebClient
                .create("http://localhost:8888/ws/userService/user/1")
                .accept(MediaType.APPLICATION_JSON)//指定响应的数据格式为json
                .get(User.class);
        System.out.println(u);
    }
}
