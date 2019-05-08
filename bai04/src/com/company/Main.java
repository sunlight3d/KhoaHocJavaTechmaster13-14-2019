package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(100.0, 200.2);
        Rectangle r2 = new Rectangle(200.0, 300.2);
        Rectangle r3 = new Rectangle(300.0, 500.2);
        System.out.println(r1.toString());
        Engineer e1 = new Engineer("Haong",
                "hoang12@gmail.com",
                "Java Developer",
                20, 123.9);
        Engineer e2 = new Engineer("Haong 2",
                "hoang2222@gmail.com",
                "PHP Developer",
                22, 133.9);
        Engineer e3 = new Engineer("Haong 3",
                "hoang333@gmail.com",
                "Sales manager",
                23, 123.9);
        Engineer e4 = new Engineer("Haong 4",
                "hoang444@gmail.com",
                "Marketing Staff",
                4, 123.9);
        Department d1 = new Department("IT","BachMai street",
                "This is IT Dept");
        Department d2 = new Department("Sales","HaiBaTrung street",
                "This is Sales Dept");
        //e1, e3 in IT ?
        e1.setDepartment(d1);
        e3.setDepartment(d1);
        //e2, e4 in Sales ?
        e2.setDepartment(d2);
        e4.setDepartment(d2);
        Engineer.baseSalary = 100.0;
        System.out.println("E1 salary ="+e1.baseSalary);
        System.out.println("Number of engineers = "+Engineer.numberOfObjects);
        System.out.println("E1'name ="+e1.getName());
        e2.sayHello();
        BankAccount accountMrHoang = new BankAccount("Hoang",
                "1979-10-25");
        accountMrHoang.deposit(1100.0);
        System.out.println("Balance = "+accountMrHoang.getBalance());

    }
}
