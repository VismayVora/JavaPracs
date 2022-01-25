package com.Vismay;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (less than 10 Billion): ");
        int num = sc.nextInt();
        int count = 0;

        do{num = num/10;
            count++;
        }while(num != 0);

        System.out.println("The number of digits in the given integer is: " + count);
    }
}
