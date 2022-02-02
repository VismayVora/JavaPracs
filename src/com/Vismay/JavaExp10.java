package com.Vismay;

import java.util.Scanner;

class Students{
    int i,a;
    Scanner scan=new Scanner(System.in);

    void roll() {
        System.out.print("Enter the student's roll_no.:");
        a=scan.nextInt();
    }

    void call() {
        System.out.println("The student with roll_no:"+a);
    }
}

class Test extends Students{
    int sem1,sem2;
    Scanner scan=new Scanner(System.in);

    void enter() {
        System.out.print("Sem 1 Marks(out of 600):");
        sem1=scan.nextInt();
        System.out.print("Sem 2 Marks(out of 600):");
        sem2=scan.nextInt();
    }
}

interface Sports {
    int score=48;

    void disp();
}

class Results extends Test implements Sports {
    public void disp() {
        System.out.println("Sports Marks(out of 50):"+score);
    }

    void output() {
        int total=sem1+sem2+score;
        System.out.println("Total marks scored:"+total);
    }
}

class JavaExp10
{
    public static void main(String args[]) {
        Results r=new Results();
        r.roll();
        r.enter();
        r.disp();
        r.call();
        r.output();
    }
}

