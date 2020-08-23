package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//maps to db table named User
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)//jpa will genrate value for us
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
