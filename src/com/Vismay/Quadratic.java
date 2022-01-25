package com.Vismay;

import java.util.Scanner;
import java.lang.Math;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first coefficient: ");
        double a = sc.nextFloat();

        System.out.print("Enter the second coefficient: ");
        double b = sc.nextFloat();

        System.out.print("Enter the constant: ");
        double c = sc.nextFloat();

        System.out.println("The quadratic equation is: "+ a +"x^2 + " + b + "x + " + c );

        double D = b*b - 4*a*c;
        if (D > 0){
            double x1 = ((-b + Math.sqrt(D))/(2*a));
            double x2 = ((-b - Math.sqrt(D))/(2*a));
            System.out.println("The roots are "+ x1 + " and " + x2 + ".");
        }
        else if(D == 0){
            double x = ((-b + Math.sqrt(D))/(2*a));
            System.out.println("The root is "+ x + " and it is a repeated root.");
        }
        else{
            double real_part = (-b/2*a);
            double imaginary_part = (Math.sqrt(-D)/(2*a));
            System.out.printf("The first root is: %.3f + %.3fi", real_part, imaginary_part);
            System.out.printf("\nThe second root is: %.3f - %.3fi", real_part, imaginary_part);
        }



    }
}
