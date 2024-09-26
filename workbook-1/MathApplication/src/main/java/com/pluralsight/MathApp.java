package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
//        Question 1:
        int bobSalary = 299;
        int garySalary = 300;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary + " between Bob's salary of " + bobSalary + " and Gary's salary of " + garySalary);

//        Question 2:
        int carPrice = 3_999;
        int truckPrice = 2_999;
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestPrice + " between the car's price of " + carPrice + " and the truck's price of " + truckPrice);

//        Question 3:
        double area = Math.PI * Math.pow(7.25, 2);
        System.out.println("The area for a circle with a radius of 7.25 is " + area);

//        Question 4:
        double number = 5.0;
        double squared = Math.sqrt(number);
        System.out.println("The square root of 5 is " + squared);

//        Question 5:
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double distance = Math.sqrt(Math.pow((x1 + x2), 2) + Math.pow((y1 + y2), 2));
        System.out.println("The distance between the points (5,10) and (85,50) is " + distance);

//        Question 6:
        double negativeNumber = -3.8;
        System.out.println("The absolute value of -3.8 is " + Math.abs(negativeNumber));

//        Question 7:
        System.out.println("A random value between 0 and 1 is " + Math.random());

    }
}