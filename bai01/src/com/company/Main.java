package com.company;

import sun.util.calendar.CalendarUtils;
enum Direction {North, South, West, East};
enum Size {Small, Big, Normal};
enum Quality {Bad, Good, Excellent};

public class Main {
    public static final String APP_NAME = "Hello app";//params
    public static void main(String[] args) {
        //args = arguments
        int age = 10;
	    System.out.println("I am "+age+" years old");
	    //string concatenation = string template
        Integer x = 100;
        Float y = 100.0f;
        Double z = 1020.3;
        float x1 = 1020.0f;
        int x2 = (int)x1;
        System.out.println("Sum 2 numbers is " +
                Calculation.sum2Numbers(10.0, 11.0));
        Integer x3 = 3;
        System.out.println("Remainder  = "+x3%2);
        Direction d1 = Direction.North;
        Direction d2 = Direction.East;
        Integer mark = 6;
        Boolean result = (mark >= 5) && (mark <=7);
        System.out.println("Result = "+result);
    }
}
