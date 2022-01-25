package com.Vismay;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();

        for(int i = 1; i <=n; i++){
            if(i%2 != 0){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }

            }else{
                for(int j=i;j>0;j--){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

//        for(int k = 1; k < n; k++){
//            for(int l=n-k; l>0;l--){
//                System.out.print(" ");
//            }
//            for(int m = k ;m > k ;m--){
//                System.out.print((char)m);
//            }
//            System.out.println();
//        }
    }
}
