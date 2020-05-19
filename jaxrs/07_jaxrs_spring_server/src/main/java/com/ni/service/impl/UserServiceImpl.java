package com.ni.service.impl;

import com.ni.domain.Car;
import com.ni.domain.User;
import com.ni.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(User user) {
        System.out.println("saveUser被调用了");
        System.out.println(user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("updateUser被调用了");
        System.out.println(user);
    }

    @Override
    public List<User> findAllUsers() {
        System.out.println("findAllUsers被调用了");
        List<User> list = new ArrayList<>();
        User u1 = new User();
        u1.setUsername("aaa");
        u1.setCity("shanghai");
        List<Car> cars = new ArrayList<>();
        Car c1 = new Car();
        c1.setCarName("宝马");
        c1.setPrice(20000d);
        cars.add(c1);
        list.add(u1);
        return list;
    }

    @Override
    public User findUserById(Integer id) {
        System.out.println("findUserById被调用了");
        User user  = new User();
        user.setId(id);
        user.setUsername("bbb");
        user.setCity("guangzhou");
        return user;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("deleteUser方法被调用了, 删除id+ "+id);
    }
}
