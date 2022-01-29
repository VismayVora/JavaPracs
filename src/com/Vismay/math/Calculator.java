package com.Vismay.math;

public class Calculator{

    public int fact(int x){
        if(x==0 || x==1)
            return 1;
        else
            return x*fact(x-1);
    }

    public int power(int x,int n){
        if(n==0)
            return 1;
        else
            return x*power(x,n-1);
    }
}



