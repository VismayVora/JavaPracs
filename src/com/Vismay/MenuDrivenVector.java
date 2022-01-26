package com.Vismay;

import java.util.Vector;
import java.util.Scanner;

public class MenuDrivenVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items in the shopping list:");
        int n = sc.nextInt();
        System.out.println("1.Create the shopping list");
        System.out.println("2.Add an item to the shopping list at a particular position.");
        System.out.println("3.Delete an item in the shopping list.");
        System.out.println("4.Display the shopping list.");
        System.out.println("5.Exit.");
        Vector v1 = new Vector(n);
        int x = 1;
        while(x > 0) {
            System.out.print("Enter one of the options:");
            x = sc.nextInt();
            switch(x){
                case 1: {
                    for(int i = 0; i < n; i++) {
                        System.out.print("Enter the name of the item:");
                        String item = sc.next();
                        v1.add(item);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter the name of the item:");
                    String item = sc.next();
                    System.out.println("Enter the position of the item:");
                    int index = sc.nextInt();
                    v1.add(index-1,item); // User doesn't know index starts from 0 so accounting for that.
                    break;
                }
                case 3: {
                    System.out.print("Enter the position of the element you want to remove.");
                    int index = sc.nextInt();
                    v1.remove(index-1); // User doesn't know index starts from 0 so accounting for that.
                    break;
                }
                case 4: {
                    System.out.println("The shopping list is: "+v1);
                    break;
                }
                case 5: {
                    x = 0;
                    System.out.println("Thank You!");
                    break;
                }
                default:
                    System.out.println("Invalid Input!");
            }//System.out.println("Size is: "+v1.size());
            //System.out.println("Default capacity is: "+v1.capacity());
        }
    }
}

