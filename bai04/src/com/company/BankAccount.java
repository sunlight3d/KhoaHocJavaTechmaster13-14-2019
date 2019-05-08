package com.company;

import java.util.Date;

public class BankAccount {
    private static Double BASE_BALANCE = 100.0;
    private String name;
    private String dob;
    private Double balance = 100.0;
    public Double getBalance() {
        return balance;
    }
    public BankAccount(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void deposit(Double moneyAmount){
        //this.balance = this.balance + moneyAmount;
        this.balance += moneyAmount;
    }
    public void withdraw(Double moneyAmount) {
        if(this.balance - moneyAmount > BankAccount.BASE_BALANCE) {
            //this.balance = this.balance - moneyAmount;
            this.balance -= moneyAmount;
        } else {
            System.out.println("Exceed money amount, cannot withdraw");
        }
    }
}
