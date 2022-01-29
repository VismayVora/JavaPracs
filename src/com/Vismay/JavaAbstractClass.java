package com.Vismay;

abstract class Area
{
    abstract float rectArea (float l, float b);
    abstract float circleArea (float r);
    abstract float triangleArea (float height, float base);
}
class FindArea extends Area
{
    float rectArea (float l, float b)
    {
        return l * b;
    }
    float circleArea (float r)
    {
        return 3.142f* r * r;
    }
    float triangleArea (float height, float base)
    {
        return height * base / 2;
    }
}
public class JavaAbstractClass
{
    public static void main (String[]args)
    {
        FindArea area = new FindArea ();
        System.out.println ("Area of rectangle : " + area.rectArea (7,19));
        System.out.println ("Area of Circle : " + area.circleArea (8));
        System.out.println ("Area of Triangle : " +area.triangleArea (12,5));
    }
}
