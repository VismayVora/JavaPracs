package com.Vismay;

import java.io.*;
import java.util.Scanner;
class Result
{
    String name, seat_no, date;
    int total_marks, centre_number, java, dbms, ds;
    void read ()
    {
        Scanner s = new Scanner (System.in);
        System.out.println ("Name:");
        name = s.nextLine ();
        System.out.println ("Seat_no:");
        seat_no = s.nextLine ();
    }
    void display ()
    {
        total_marks = java + ds + dbms;
        System.out.println (name);
        System.out.println (seat_no);
        System.out.println ("Total marks: " + total_marks);
    }
}
class MarksOutOfBoundsException extends Exception
{
    MarksOutOfBoundsException (String s)
    {
        System.out.println (s);
    }
}
public class JavaExceptions2
{
    public static void main (String[]args) throws IOException
    {
        Result r = new Result ();
        BufferedReader br =
                new BufferedReader (new InputStreamReader (System.in));
        r.read ();
        try
        {
            System.out.println ("Enter marks");
            r.java = Integer.parseInt (br.readLine ());
            if (r.java <= 0 || r.java >= 100)
            {
                throw new MarksOutOfBoundsException ("Marks range from 0-100");
            }
        }
        catch (MarksOutOfBoundsException e)
        {
            System.out.println (e);
            r.java = Integer.parseInt (br.readLine ());
        }
        try
        {
            System.out.println ("Enter marks");
            r.dbms = Integer.parseInt (br.readLine ());
            if (r.dbms <= 0 || r.dbms >= 100)
            {
                throw new MarksOutOfBoundsException ("Marks range from 0-100");
            }
        }
        catch (MarksOutOfBoundsException e)
        {
            System.out.println (e);
            r.dbms = Integer.parseInt (br.readLine ());
        }
        try
        {
            System.out.println ("Enter marks");
            r.ds = Integer.parseInt (br.readLine ());
            if (r.ds <= 0 || r.ds >= 100)
            {
                throw new MarksOutOfBoundsException ("Marks range from 0-100");
            }
        }
        catch (MarksOutOfBoundsException e)
        {
            System.out.println (e);
            r.ds = Integer.parseInt (br.readLine ());
        }
        r.display ();
    }
}

