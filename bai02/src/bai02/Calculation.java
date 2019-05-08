/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai02;

import java.util.ArrayList;

public class Calculation {
    public static String calculateMark(Float mark) {
        String message = "";
        if (mark >= 0 && mark < 5) {
            message = "Ko dat";
        } else if (mark >= 5 && mark <= 7) {
            message = "Kha";
        } else if (mark > 7 && mark <= 8) {
            message = "Gioi";
        } else if (mark > 8 && mark <= 10) {
            message = "Xuat sac";
        } else {
            message = "Ko hop le";
        }
        return message;
    }
    public static Double fX(Double x) {
        //pow = power = ham mu 
        //Double result = 3*Math.pow(x, 10) - 2*x - 1;
        Double result = 3*Math.sin(Math.pow(x, 7)) - Math.sin(2*x) - 1;
        return result;
    }
    
    //function without return value
    public static void sayHello(String name) {
        System.out.println("Chao mr "+name);
        //return
    }
    public static void showAge(Integer age) {
        /*
        if(age < 18) {
            age = 18;
        }
        */
        age = (age < 18 || age == null) ? 18 : age;//ternary
        System.out.println("Age = "+age);        
    }
    /*
    
    */
    public static void calculateDay(Integer day) {
        String result = "";
        switch(day) {
            case 1: {
                result = "Sunday";
                break;
            }
            case 2: {
                result = "Monday";
                break;
            }
            case 3: {
                result = "Tuesday";
                break;
            }
            case 4: {
                result = "Wednesday";
                break;
            }
            case 5: {
                result = "Thursday";
                break;
            }
            
            case 6: {
                result = "Friday";
                break;
            }
            case 7: {
                result = "Monday";
                break;
            }
            default: {
                result = "Unknown";
                break;
            }
        }
        System.out.println("Today is : "+result);
    }
    public static void makeNumbers() {
        int numbers[] = {1, 4, 5,6, 7,9 };
        ArrayList<Integer> odds = new ArrayList<Integer>();
        ArrayList<Integer> evens = new ArrayList<Integer>();
      
        for(int i = 0; i < numbers.length; i ++) {
            if(numbers[i] % 2 == 0) {
                odds.add(numbers[i]);                
            } else {
                evens.add(numbers[i]);
            }
        }
        System.out.println("So chan: "+odds);
        System.out.println("So le: "+evens);
    }
}
