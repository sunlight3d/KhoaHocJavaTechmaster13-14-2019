package com.company;

public class Engineer extends Person{
    private String job;
    private Double salary;
    public static Double baseSalary;
    public static Integer numberOfObjects = 0;
    private Department department;
    Engineer(String name, String email, String job,
             Integer age, Double salary){
        super(name, email, age);//super = "Person"
        this.job = job;
        this.salary = salary;
        numberOfObjects++;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department){
        this.department = department;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Engineers say Hello");
    }
}
