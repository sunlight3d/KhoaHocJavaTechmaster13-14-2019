package com.company;

public class Person {
    private String name, email;
    private Integer age;

    public Person(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    protected void sayHello() {
        System.out.println("Person says Hello");
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }
}
