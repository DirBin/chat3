package com.ivan.entity;

import java.io.Serializable;

/**
 * 描述：
 *
 * @auth mrz
 * @mail 617071233@qq.com
 * @create 2017/7/29 10:28
 */
@SuppressWarnings("serial")
public class User implements Serializable{
    private Integer id;

    private String name;

    private Integer age;

    public User(){};

    public User(Integer id,String name,Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
