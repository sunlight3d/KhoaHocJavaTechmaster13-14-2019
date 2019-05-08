/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai02;

import java.util.Date;
import java.sql.Timestamp;

public class Bai02 {

    public static void main(String[] args) {
        Float mark = 5.5f;
        if (mark > 5.0f && mark <= 10) {
            System.out.println("Mark is ok");
        }
        if (mark < 0.0f || mark > 10.00f) {
            System.out.println("Mark is not in correct format");
        }
        Double moneyAmount = 1000000.0;
        Date date1 = new Date();
        long time1 = date1.getTime();               
        
        /*
        Integer i = 0;//i = iterator / index
        
        while(i < Math.pow(10, 9)) {
            i++;
            
            Calculation.calculateMark(mark);//chay 3925
//            i++;
        }
        */
        Integer i = 0;
        for(i = 0; i < Math.pow(10, 9); i++) {
            Calculation.calculateMark(mark);//chay 4039ms
        }
        System.out.println("i = "+i);
        Date date2 = new Date();        
        long time2 = date2.getTime();
        System.out.println("time1 = "+time1);
        System.out.println("time2 = "+time2);
        System.out.println("Thoi gian tinh toan = "+(time2 - time1));
        //System.out.println("f(3) = "+Calculation.fX(100.0));
        Calculation.sayHello("Alex");
        Calculation.showAge(2);
        Calculation.calculateDay(3);
        Calculation.makeNumbers();
    }
}
