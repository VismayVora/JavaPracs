package com.Vismay;

import java.util.Scanner;
import java.lang.Math;

public class OddandPrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial number: ");
        int lower_limit = sc.nextInt();
        System.out.print("Enter the last number: ");
        int upper_limit = sc.nextInt();

        if (lower_limit < upper_limit) {
            System.out.println("The odd numbers in the given range are: ");
            for (int i = lower_limit; i <= upper_limit; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("The prime numbers in the given range are:");
            for (int i = lower_limit; i <= upper_limit; i++) {
                int flag = 1;
                if (i == 1 || i == 0) {
                    continue;
                }
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }if (flag ==1) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("The initial number is greater than the last number!");
        }
    }
}