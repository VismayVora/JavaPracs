package com.Vismay;
import java.util.Scanner;

public class MatricesAddition {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of rows for both the arrays:");
        int r = s1.nextInt();
        System.out.println("Enter the number of columns for both the arrays:");
        int c = s1.nextInt();
        int x[][] = new int[r][c];
        int y[][] = new int[r][c];
        int sum[][] = new int[r][c];
        System.out.println("First Array:");
        for(int i = 0; i<r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.println("Enter a number:");
                x[i][j] = s1.nextInt();
            }
        }
        System.out.println("The elements of the first array are:");
        for(int i = 0; i<r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second Array:");
        for(int i = 0; i<r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.println("Enter a number:");
                y[i][j] = s1.nextInt();
            }
        }
        System.out.println("The elements of the second array are:");
        for(int i = 0; i<r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(y[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i<r; i++) {
            for(int j = 0; j < c; j++) {
                sum[i][j] = x[i][j]  + y[i][j];
            }
        }
        System.out.println("The Sum of the arrays is: ");
        for(int i = 0; i<r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
