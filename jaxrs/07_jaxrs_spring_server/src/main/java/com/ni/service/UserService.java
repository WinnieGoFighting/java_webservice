package com.ni.service;
import com.ni.domain.User;

import javax.ws.rs.*;
import java.util.List;

@Path("/userService") //访问当前服务接口对应的路径
public interface UserService {

    @POST //表示处理的请求的类型：对应新增操作
    @Path("/user") ////访问当前服务接口方法对应的路径
    @Consumes({"application/xml","application/json"})
    public void saveUser(User user);

    @PUT//对应更新操作
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void updateUser(User user);

    @GET //对应查询操作
    @Path("/user")
    @Produces({"application/xml","application/json"})
    public List<User> findAllUsers();

    @GET //对应查询操作
    @Path("/user/{id}")
    @Produces({"application/xml","application/json"})
    public User findUserById(@PathParam("id") Integer id);

    @DELETE //对应删除操作
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    public void deleteUser(@PathParam("id") Integer id);

}
