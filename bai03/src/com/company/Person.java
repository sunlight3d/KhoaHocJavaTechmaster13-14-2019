package com.company;

public class Person{
    private String name, email;
    private Integer age;

    public Person(){
        //Default constructor = Hàm khởi tạo mặc định
        System.out.println("2.This is a constructor");
    }
    //custom constructor = Hàm khởi tạo tùy biến
    Person(String name, String email, Integer age){
        this.name = name;
        this.email = email;
        this.age = age;
    }
    {
        System.out.println("1.This is a block");
        name = "";
        email="";
        age = 18;
    }
    //methods:
    public void run() {
        System.out.println("I am running");
    }
    public void walk(Double numberOfKilometers) {
        System.out.println("I am walking "+numberOfKilometers+"km");

    }

    @Override
    public String toString() {
        return "person1's name ="+name+
                ",person1's email ="+email+",person1's age ="+age;
    }
    //getter
    public String getName() {
        return name;
    }
    //setter
    /*
    public void setName(String name) {
        this.name = name;
    }
    */
}
