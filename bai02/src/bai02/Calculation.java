/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai02;

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
}
