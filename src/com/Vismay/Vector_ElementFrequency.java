package com.Vismay;

import java.util.Scanner;
import java.util.Vector;

public class Vector_ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items in the vector:");
        int n = sc.nextInt();
        Vector v = new Vector(n);
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the name of the item:");
            String item = sc.next();
            v.add(item);
        }
        System.out.print("Enter the element whose frequency you want to find out:");
        String element = sc.next();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(element.equals(v.get(i))) {
                count++;
            }
        }
        System.out.print("The frequency of the element is:"+ count);
    }
}
