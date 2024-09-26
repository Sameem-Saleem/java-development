package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        String name = inputString("Enter your name: ");
        float hoursWorked = inputFloat("Enter your hours worked: ");
        float payRate = inputFloat("Enter your pay rate: ");
        System.out.println("Hello " + name + ", your gross pay is " + (hoursWorked * payRate));
    }



























    private static float inputFloat(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        float output = scanner.nextFloat();
        scanner.nextLine();
        return output;
    }

    private static String inputString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
}