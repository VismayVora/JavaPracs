package com.Vismay;

import java.util.Scanner;

public class AreaByOverloading
{
    static double Area(double s){
        return s*s;
    }

    static double Area(double l, double b){
        return l*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' for square and '2' for rectangle:");
        int option = sc.nextInt();

        if (option == 1){
            System.out.println("Enter the side:");
            double side = sc.nextDouble();
            double a = Area(side);
            System.out.println("The area of the square is:"+a);
        }else {
            System.out.println("Enter the sides:");
            double length = sc.nextDouble();
            double breadth = sc.nextDouble();
            double a = Area(length,breadth);
            System.out.println("The area of the rectangle is:"+a);
        }
    }
}
