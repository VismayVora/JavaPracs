package com.Vismay;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        float a = sc.nextFloat();

        System.out.println("The following are the available operations: ");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: *");
        System.out.println("4: /");
        System.out.println("5: %");
        System.out.print("Choose a number corresponding to the operation: ");
        int option = sc.nextInt();

        System.out.print("Enter the second number:");
        float b = sc.nextFloat();

        float result;

        switch(option){
            case 1: result = a + b;
                System.out.println("The result is " + result);
            break;
            case 2: result = a - b;
                System.out.println("The result is " + result);
            break;
            case 3: result = a * b;
                System.out.println("The result is " + result);
            break;
            case 4: result = a / b;
                System.out.println("The result is " + result);
            break;
            case 5: result = a % b;
                System.out.println("The result is " + result);
            break;
            default:
                System.out.println("Please enter a valid option number!");
        }
    }
}
