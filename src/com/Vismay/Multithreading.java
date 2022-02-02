package com.Vismay;

class Table5 extends Thread
{
    public void run ()
    {
        long time = System.currentTimeMillis ();
        for (int i = 1; i <= 10; i++)
        {
            System.out.print (5 * i + "\t");
        }
        time = System.currentTimeMillis () - time;
        System.out.println ("Time taken for 5: " + time);
    }
}
class Table7 extends Thread
{
    public void run ()
    {
        long time = System.currentTimeMillis ();
        for (int i = 1; i <= 10; i++)
        {
            System.out.print (7 * i + "\t");
        }
        time = System.currentTimeMillis () - time;
        System.out.println ("Time taken for 7: " + time);
    }
}
class Table13 extends Thread
{
    public void run ()
    {
        long time = System.currentTimeMillis ();
        for (int i = 1; i <= 10; i++)
        {
            System.out.print (13 * i + "\t");
        }
        time = System.currentTimeMillis () - time;
        System.out.println ("Time taken for 13: " + time);
    }
}
public class Multithreading
{
    public static void main (String[]args)
    {
        Table5 t5 = new Table5 ();
        Table7 t7 = new Table7 ();
        Table13 t13 = new Table13 ();
        t5.start ();
        t7.start ();
        t13.start ();
    }
}
