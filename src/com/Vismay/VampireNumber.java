package com.Vismay;

import java.util.Scanner;

public class VampireNumber {
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arr[] = new int[4];
            for (int i=0; i<4; i++) {
                System.out.print("Enter digit "+(i+1)+" :");
                arr[i] = sc.nextInt();
            }
            int n = arr[0]*1000 + arr[1]*100 + arr[2]*10 + arr[3];
            System.out.println("The number is:"+n);

            int multipliers[] = new int[12];   // 4C2 * 2! = 12
            int k = 0;
            for(int i = 0; i<4; i++)
            {
                for(int j=i+1; j<4; j++)
                {
                    multipliers[k] = (10*arr[i])+arr[j];
                    k++;
                }
            }
            for(int i = 3; i>=0; i--)
            {
                for(int j=i-1; j>=0; j--)
                {
                    multipliers[k] = (10*arr[i])+arr[j];
                    k++;
                }
            }
            //for (int i=0; i<12; i++)//{
            //System.out.println(multipliers[i]);//}
            int flag = 0;
            for(int i = 0; i<12; i++)
            {
                for(int j=i+1; j<12; j++)
                {
                    if(multipliers[i]*multipliers[j] == n)
                    {
                        flag=1;
                        break;
                    }
                }
            }if(flag==0){
                System.out.println("It is not a vampire number!");
            }else{
                System.out.println("It is a vampire number!");
            }
        }
    }
