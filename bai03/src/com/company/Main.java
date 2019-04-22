package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Person person1 = new Person();
        System.out.println("Person's name = "+person1.name);

        person1.name = "Hoang";
        person1.email = "hoang123@gmail.com";
        person1.age = 30;
        //Nếu có 100 thuộc tính => dùng custom constructor
        */
        Person person1 = new Person("Hoang",
                "hoang23@gmail.com", 30);
        System.out.println("person1 = "+person1);
        person1.setName("hhh");
        System.out.println(person1.toString());
        System.out.println("Name = "+person1.getName());
        person1.run();
        person1.walk(10.2);
}
    }
