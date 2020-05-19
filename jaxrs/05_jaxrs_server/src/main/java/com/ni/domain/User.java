package com.ni.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 指定对象序列化为xml或者json数据时根节点的名称
 * xml:
 *  <User>
 *      <id></id>
 *      <username></username>
 *      ...
 *  </User>
 *
 *  json:
 *  {"User":{"id":10,"username":"mike","city":"sh","cars":{{},{},{}}}}
 */
@XmlRootElement(name="User")
public class User {
    private Integer id;
    private String username;
    private String city;
    private List<Car> cars = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", city='" + city + '\'' +
                ", cars=" + cars +
                '}';
    }
}
