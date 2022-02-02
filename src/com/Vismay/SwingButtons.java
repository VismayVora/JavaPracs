package com.Vismay;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingButtons extends JFrame implements ActionListener {
    Container c;
    JButton btn1, btn2, btn3, btn4, btnExit;
    JLabel label;

    SwingButtons() {
        c = getContentPane();
        c.setLayout(null);
        btn1 = new JButton("Hello");
        btn2 = new JButton("I'm Vismay!");
        btn3 = new JButton("Linkedin");
        btn4 = new JButton("Twitter");
        btnExit = new JButton("Exit");
        label = new JLabel(" ");
        label.setSize(200, 60);
        btn1.setLocation(100, 50);
        btn2.setLocation(100, 110);
        btn3.setLocation(100, 170);
        btn4.setLocation(100, 230);
        btnExit.setLocation(100, 290);
        btn1.setSize(100, 50);
        btn2.setSize(100, 50);
        btn3.setSize(100, 50);
        btn4.setSize(100, 50);
        btnExit.setSize(100, 50);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btnExit);
        c.add(label);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btnExit.addActionListener(this);
    }

    public static void main(String[] args) {
        SwingButtons exp = new SwingButtons();
        exp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        exp.setBounds(200, 200, 400, 500);
        exp.setVisible(true);
        exp.setTitle("Click For Magic");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            label.setText("Hello");
            label.setLocation(220, 50);
        } else if (e.getSource() == btn2) {
            label.setText("I'm Vismay!");
            label.setLocation(220, 110);
        } else if (e.getSource() == btn3) {
            label.setText("Linkedin Profile");
            label.setLocation(220, 160);
        } else if (e.getSource() == btn4) {
            label.setText("Twitter Profile");
            label.setLocation(220, 230);
        } else {
            System.exit(0);
        }
    }
}
