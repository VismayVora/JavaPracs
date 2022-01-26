package com.Vismay;

import java.util.Scanner;

public class OneDto2DArray {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s1.nextInt();
        int x[] = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter a number:");
            x[i] = s1.nextInt();
        }

        System.out.print("Enter the number of rows:");
        int r = s1.nextInt();
        System.out.print("Enter the number of columns:");
        int c = s1.nextInt();

        int arr[][] = new int[r][c];
        if (r*c == n) {
            int k = 0;
            for(int i = 0; i<r; i++)
            {
                for(int j = 0; j < c; j++) {
                    arr[i][j] = x[k];
                    k++;
                }
            }
            System.out.println("The elements of the array are:");
            for(int i = 0; i<r; i++)
            {
                int sum =0;
                for(int j = 0; j < c; j++) {
                    System.out.print(arr[i][j]+"\t");
                    sum += arr[i][j];
                }
                System.out.print("| ");
                System.out.println(sum);
            }

            for(int i=0;i<c;i++){
                System.out.print("___");
            }
            System.out.println("\t|");

            for(int j =0; j < c; j++) {
                int sum =0;
                for(int i = 0; i < r; i++) {
                    sum += arr[i][j];
                }
                System.out.print(sum + "\t");
            }
            int elements_sum = 0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    elements_sum += arr[i][j];
                }
            }
            System.out.println("  " + elements_sum);
        } else
            System.out.println("Please enter valid number of rows and columns!");
        }
}

