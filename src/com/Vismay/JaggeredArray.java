package com.Vismay;

public class JaggeredArray {
    public static void main(String[] args) {
        int x[][] = new int[3][];
        for (int i=0; i<3; i++){
            x[i] = new int[i+1];
        }
        int k =1;
        for (int i=0; i<3; i++) {
            for (int j=0; j<=i; j++) {
                x[i][j] = k;
                k++;
            }
        }
        for (int i=0; i<3; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}

