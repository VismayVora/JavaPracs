package com.Vismay;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial number: ");
        int lower_limit = sc.nextInt();
        System.out.print("Enter the last number: ");
        int upper_limit = sc.nextInt();

        if (lower_limit < upper_limit){
            System.out.println("The odd numbers in the given range are: ");
            for (int i = lower_limit; i<=upper_limit; i++){
                if(i%2 != 0){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}