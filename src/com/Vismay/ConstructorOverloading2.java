package com.Vismay;

import java.util.*;
class Rect
{
    int s1,s2;
    Rect(int l, int b)
    {
        s1=l;
        s2=b;
    }
    int area()
    {
        return s1 * s2;
    }
}
class Cube
{
    int s1,s2;
    Cube(int side)
    {
        s1=side;
        s2=side;
    }
    int volume ()
    {
        return s1*s1*s1;
    }
}
class Size
{
    int size (Object z)
    {
        if (z instanceof Rect)
        {
            return ((Rect) z).area ();
        }
        else if (z instanceof Cube)
        {
            return ((Cube) z).volume ();
        }
        else
        {
            return -1;
        }
    }
}
public class ConstructorOverloading2
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        Rect r = new Rect (7, 18);
        Cube c = new Cube (12);
        Size s = new Size();
        System.out.println ("Area of Rectangle : " + s.size (r));
        System.out.println ("Volume of Cube : " + s.size (c));
        System.out.println ("Other objects : " + s.size (sc));
    }
}

