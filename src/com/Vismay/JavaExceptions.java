package com.Vismay;

import java.io.*;
public class JavaExceptions {
    public static void main(String[] args) throws IOException {
        int n,invalid=0;
        BufferedReader br=new BufferedReader(new
                InputStreamReader(System.in));
        for(int i=0;i<10;i++)
        {
            try{
                System.out.println("Enter a number: ");
                n = Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException e)
            {
                System.out.println(e);
                invalid++;
            }
        }
        System.out.println("Number of valid:");
        System.out.println(10-invalid);
        System.out.println("Number of invalid:");
        System.out.println(invalid);
    }
}

