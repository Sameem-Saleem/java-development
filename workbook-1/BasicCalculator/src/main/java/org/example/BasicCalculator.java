package org.example;
import java.util.Scanner;

public class BasicCalculator {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int firstNumber = inputInteger("Enter the first number: ");
        int secondNumber = inputInteger("Enter the second number: ");
        char operation = inputChar("\nPossible calculations:\n  (A)dd\n  (S)ubtract\n  (M)ultiply\n  (D)ivide\nPlease select an option: ");

        if (operation == 'A') {
            System.out.println("\n" + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        }
        if (operation == 'S') {
            System.out.println("\n" + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        }
        if (operation == 'M') {
            System.out.println("\n" + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        }
        if (operation == 'D') {
            System.out.println("\n" + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        }
        scanner.close();
    }
    private static int inputInteger(String prompt) {
        System.out.print(prompt);
        int output = scanner.nextInt();
        scanner.nextLine();
        return output;
    }
    private static char inputChar(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().charAt(0);
    }
}