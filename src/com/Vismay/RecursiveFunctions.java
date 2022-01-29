package com.Vismay;

import java.util.Scanner;
import java.lang.Math;

class RecursiveFunctions
{
    public static void main (String args[])
    {
        int choice;
        do{
            System.out.println ("*****MAIN MENU*****");
            System.out.println ("1.To find GCD and LCM");
            System.out.println ("2.To find X^Y");
            System.out.println ("3.To print n Fibonacci numbers");
            System.out.println ("4.To find reverse of number");
            System.out.println ("5.To 1+2+3+4+.	+(n-1)+n");
            System.out.println ("6.Calculate sum of digits of a number");
            System.out.println ("7.EXIT");
            Scanner scan = new Scanner (System.in);
            System.out.print ("Enter your choice:");
            choice = scan.nextInt ();
            Gclc gc = new Gclc ();
            Po pw = new Po ();
            Fib fi = new Fib ();
            Rev rv = new Rev ();
            S sm = new S ();
            D dg = new D ();
            switch (choice)
            {
                case 1:
                    gc.gcd ();
                    break;
                case 2:pw.pr ();
                    break;
                case 3:fi.fib ();
                    break;
                case 4:rv.re ();

                    break;
                case 5:sm.su ();
                    break;
                case 6:dg.di ();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        while(choice!=7);
    }
}
class Gclc
{
    public static void gcd ()
    {
        int c, d, hcf, lcm;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter any 2 nos. whose gcd and lcm you want:");
        GL g = new GL ();
        c = scan.nextInt ();
        d = scan.nextInt ();
        hcf = g.GCD (c, d);
        System.out.println ("The GCD Of entered nos. is " + hcf);
        System.out.println ("The LCM of entered nos. is " + (c * d) / hcf);
    }
}
class GL
{
    static int GCD (int x, int y)
    {
        if (y == 0)
        {
            return x;
        }
        else
        {
            return GCD (y, x % y);
        }
    }
}

class Po
{
    public static void pr ()
    {
        double base, p, result;
        Scanner scan = new Scanner (System.in);
        Power pr = new Power ();
        System.out.print ("Enter base part of the number:");
        base = scan.nextDouble ();
        System.out.print ("Enter the power part of the number:");
        p = scan.nextDouble ();
        result = pr.power (base, p);
        System.out.print ("The result is:" + base + "^" + p + "=" + result);
        System.out.println();
    }

}
class Power
{
    static double power (double base, double p)
    {
        if (p != 0)
        {
            return (base * Math.pow (base, p - 1));
        }
        else
        {
            return 1;
        }
    }
}

class Fib
{
    public static void fib ()
    {
        int a, n, i = 0;
        Scanner scan = new Scanner (System.in);
        Fibonacci f = new Fibonacci ();
        System.out.print ("Enter the no.of terms of Fibonacci series to show:");
        n = scan.nextInt ();
        System.out.println ("Fibonacci series of " + n + " terms:");
        for (a = 0; a < n; a++)
        {
            System.out.print (f.fibonacci (i) + "\t");
            i++;
        }
        System.out.println();
    }
}
class Fibonacci
{
    static int fibonacci (int b)
    {
        if (b == 0)
        {
            return 0;
        }
        else if (b == 1)
        {
            return 1;
        }
        else
        {
            return (fibonacci (b - 1) + fibonacci (b - 2));
        }
    }
}

class Rev
{
    public static void re ()
    {
        int n, m, reverse, count = 0;
        Scanner scan = new Scanner (System.in);

        Reverse r = new Reverse ();
        System.out.print ("Enter a number:");
        n = scan.nextInt ();
        m = n;
        while (m > 0)
        {
            count++;
            m = m / 10;
        }
        reverse = r.reverse (n, count);
        System.out.print ("The reversed no. is:" + reverse);
        System.out.println();
    }
}

class Reverse
{
    static int reverse (int x, int length)
    {
        if (length == 1)
        {
            return x;
        }
        else
        {
            int b = x % 10;
            x = x / 10;
            return (int) ((b * Math.pow (10, length - 1)) +
                    reverse (x, --length));
        }
    }
}

class S
{
    public static void su ()
    {
        int n, sum;
        Scanner scan = new Scanner (System.in);
        Sum s = new Sum ();
        System.out.print ("Enter the value of n:");
        n = scan.nextInt ();
        sum = s.sum (n);
        System.out.print ("The sum of " + n + " natural numbers is:" + sum);
        System.out.println();
    }
}
class Sum
{
    static int sum (int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else
        {
            return (n + sum (n - 1));
        }
    }
}

class D
{
    public static void di ()
    {
        int n, sum;
        Scanner scan = new Scanner (System.in);
        Digit d = new Digit ();
        System.out.print ("Enter a number:");
        n = scan.nextInt ();
        sum = d.digit (n);
        System.out.print ("The sum of digits of entered no. is:" + sum);
        System.out.println();
    }
}
class Digit
{
    static int digit (int n)
    {
        if (n != 0)
        {
            return (n % 10 + digit (n / 10));
        }
        else
        {
            return 0;
        }
    }
}

