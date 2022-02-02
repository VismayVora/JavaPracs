package com.Vismay;


class Table extends Thread
{
    public synchronized void run ()
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println (i);
            try
            {
                Thread.sleep (100);
            }
            catch (Exception e)
            {
            }
        }
    }
}
public class SynchronizedMultithreading
{
    public static void main (String[]args)
    {
        Table m = new Table ();
        Thread t1 = new Thread (m);
        Thread t2 = new Thread (m);
        t1.start ();
        t2.start ();
    }
}


