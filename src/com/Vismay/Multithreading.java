package com.Vismay;

import java.io.*;
import java.util.*;

class MyThread5 implements Runnable{
    public void run(){
        for(int i = 1; i<13; i++)
        {
            System.out.println("5 * "+i+ " = " + 5*i);
        }
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println("An error occurred!");
        }
    }
}

class MyThread7 implements Runnable{
    public void run(){
        for(int i = 1; i<13; i++)
        {
            System.out.println("7 * "+i+" = "+ 7*i);
        }
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println("An error occurred!");
        }
    }
}

class MyThread13 implements Runnable{
    public void run(){
        for(int i = 1; i<13; i++)
        {
            System.out.println("13 * "+i+" = "+ 13*i);
        }
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println("An error occurred!");
        }
    }
}
public class Multithreading {

    public static void main(String[] args) {
	Runnable obj1 = new MyThread5();
    Runnable obj2 = new MyThread7();
    Runnable obj3 = new MyThread13();

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    Thread t3 = new Thread(obj3);

    t1.start();
    t2.start();
    t3.start();
    }
}
