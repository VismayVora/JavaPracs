package com.Vismay;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range for the first pattern: ");
        int n1 = sc.nextInt();

        for(int i = 1; i <=n1; i++){
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

        System.out.print("Enter the range for the second pattern: ");
        int n2 = sc.nextInt();
        for(int k = 1; k <= n2; k++){
            for(int l=n2-k; l>0;l--){
                System.out.print(" ");
            }
            for(int m = k*(k+1)/2 + 64 ;m > (k*(k+1)/2) + 64 - k ;m--){
                System.out.print((char)m);
            }
            System.out.println();
        }
    }
}
