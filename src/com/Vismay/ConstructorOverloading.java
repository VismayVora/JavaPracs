package com.Vismay;

class Shape
{
    int s1, s2;
    Shape (int s)
    {
        s1 = s;
        s2 = s;
    }
    Shape (int l, int b)
    {
        s1 = l;
        s2 = b;
    }
    int area ()
    {
        return s1*s2;
    }
}
public class ConstructorOverloading {
    public static void main(String args[]) {
        Shape square = new Shape(5);
        Shape rect = new Shape(5, 3);
        System.out.println("Area of Square of side 5 : " + square.area());
        System.out.println("Area of rectangle of length 5 and breadth 3 : " + rect.area());
    }
}

