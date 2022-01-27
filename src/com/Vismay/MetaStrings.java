package com.Vismay;

import java.util.Scanner;
import jav

public class MetaStrings {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str1 = str.next();

        System.out.print("Enter another word: ");
        String str2 = str.next();

        int flag=1;
        int count=0,unmatched=0;
        int unmatched_arr[] = new int[2];

        if(str1.length() != str2.length() || str1 == str2){
            flag=0;
        }else{
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    unmatched++;
                    unmatched_arr[0] = i;
                }
            }

        }

        if(flag == 0){
            System.out.println("The given strings are not meta strings.");
        }else{
            System.out.println("The given strings are meta strings!");
        }

    }
}
