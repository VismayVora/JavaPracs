package com.Vismay;

import java.util.Scanner;

class Student
{
    int roll, phy, chem, math, total;
    String name;
    void input ()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ();
        System.out.print ("Enter student name:");
        name = scan.nextLine ();
        System.out.print ("Enter Roll_no:");
        roll = scan.nextInt ();
        System.out.println ("Enter Marks:");
        System.out.print ("Physics Marks:");
        phy = scan.nextInt ();
        System.out.print ("Chemistry Marks:");
        chem = scan.nextInt ();
        System.out.print ("Mathematics Marks:");
        math = scan.nextInt ();
        total = phy + chem + math;
        System.out.println ();
        System.out.println ("*****Student details registered*****");
    }
    void output ()
    {
        System.out.println ("Student: " + name + " ,roll_no: " + roll +
                " ,marks: ");
        System.out.println ("Physics:" + phy);
        System.out.println ("Chemistry:" + chem);
        System.out.println ("Mathematics:" + math);
        System.out.println ("Total:" + total);
    }
}

class ArrayOfObjects
{
    public static void main (String args[])
    {
        int i, j;
        Student s[] = new Student[5];
        for (i = 0; i < 5; i++)
        {
            s[i] = new Student ();
        }
        System.out.println ("Enter Details: ");
        for (i = 0; i < 5; i++)
        {
            s[i].input ();
        }
        for (i = 0; i < 5; i++)
        {
            s[i].output ();
        }
        Student temp;
        for (i = 0; i < 4; i++)
        {
            for (j = 0; j < 4 - i; j++)
            {
                if (s[j].total < s[j + 1].total)

                {
                    temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        System.out.println ("Student Marks in Descending Order:");
        for (i = 0; i < 5; i++)
        {
            System.out.println ("Student Name: " + s[i].name +
                    ", Student RollNo: " + s[i].roll + ", Total: " +
                    s[i].total);
        }
    }
}

