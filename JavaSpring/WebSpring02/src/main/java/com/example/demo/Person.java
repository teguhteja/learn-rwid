package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private int id;
    private String name;

    // generate : alt+ins > setter + getter > select all variable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("Person run");
    }
}
