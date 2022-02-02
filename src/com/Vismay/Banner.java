package com.Vismay;

import javax.swing.*;
import java.awt.*;

class Advertisement extends JFrame implements Runnable {
    Container c;
    JLabel title, ad, ad1;

    public Advertisement() {
        setTitle("Advertisement");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        c = getContentPane();
        c.setBackground(Color.blue);
        c.setLayout(null);
        title = new JLabel("***SALE***");
        title.setSize(300, 50);
        title.setLocation(300,200);
        title.setForeground(Color.red);
        title.setFont(new Font("Verdana", Font.BOLD, 38));
        c.add(title);
        ad = new JLabel("FLAT 50% Discount!");
        ad.setSize(400, 30);
        ad.setForeground(Color.yellow);
        ad.setFont(new Font("Verdana", Font.BOLD, 25));
        ad.setLocation(300, 260);
        c.add(ad);
        ad1 = new JLabel("For lucky Customers");
        ad1.setSize(400, 30);
        ad1.setForeground(Color.white);
        ad1.setFont(new Font("Verdana", Font.BOLD, 21));
        ad1.setLocation(325, 290);
        c.add(ad1);
        ad1 = new JLabel("So , what are you waiting for?");
        ad1.setSize(400, 30);
        ad1.setForeground(Color.yellow);
        ad1.setFont(new Font("Verdana", Font.BOLD, 12));
        ad1.setLocation(340, 320);
        c.add(ad1);
        new Thread(this).start();
        ad1 = new JLabel("*Terms and Conditions apply");
        ad1.setSize(400, 30);
        ad1.setForeground(Color.black);
        ad1.setFont(new Font("Verdana", Font.BOLD, 10));
        ad1.setLocation(340, 350);
        c.add(ad1);
        new Thread(this).start();
    }

    public void run() {
        try {
            while (true) {
                if (title.getText() == null) {
                    title.setText("***SALE***");
                    Thread.sleep(500);
                } else {
                    title.setText(null);
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException ex) {
        }
    }
}

public class Banner {
    public static void main(String[] args) {
        new Advertisement();
    }
}


