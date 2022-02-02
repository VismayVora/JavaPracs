package com.Vismay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Info extends JFrame implements ActionListener {
    private Container c;
    private JLabel name;
    private JTextField nameText;
    private JLabel street;
    private JTextField streetText;
    private JLabel city;
    private JTextField cityText;
    private JLabel pin;
    private JTextField pinNumber;
    private JButton myInfo;

    public Info() {
        c = getContentPane();
        c.setLayout(null);
        name = new JLabel("Name: ");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 50);
        c.add(name);
        nameText = new JTextField();
        nameText.setSize(150, 20);
        nameText.setLocation(200, 50);
        nameText.requestFocus();
        c.add(nameText);
        street = new JLabel("Street: ");
        street.setFont(new Font("Arial", Font.PLAIN, 20));
        street.setSize(100, 20);
        street.setLocation(100, 100);
        c.add(street);
        streetText = new JTextField();
        streetText.setSize(150, 20);
        streetText.setLocation(200, 100);
        c.add(streetText);
        city = new JLabel("City: ");
        city.setFont(new Font("Arial", Font.PLAIN, 20));
        city.setSize(100, 20);
        city.setLocation(100, 150);
        c.add(city);
        cityText = new JTextField();
        cityText.setSize(150, 20);
        cityText.setLocation(200, 150);
        cityText.requestFocus();
        c.add(cityText);
        pin = new JLabel("Pin Code: ");
        pin.setFont(new Font("Arial", Font.PLAIN, 20));
        pin.setSize(100, 20);
        pin.setLocation(100, 200);
        c.add(pin);
        pinNumber = new JTextField();
        pinNumber.setSize(150, 20);
        pinNumber.setLocation(200, 200);
        c.add(pinNumber);
        myInfo = new JButton("MyInfo");
        myInfo.setFont(new Font("Arial", Font.PLAIN, 15));
        myInfo.setSize(100, 30);
        myInfo.setLocation(200, 300);
        myInfo.addActionListener(this);
        c.add(myInfo);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myInfo) {
            String nameChange = nameText.getText();
            String streetChange = streetText.getText();
            String cityChange = cityText.getText();
            String pinChange = pinNumber.getText();
            nameText.setFont(new Font("Arial", Font.ITALIC, 32));
            nameText.setSize(250, 40);
            nameText.setLocation(200, 40);
            nameText.setText(nameChange);
            nameText.setEditable(false);
            streetText.setFont(new Font("Arial", Font.ITALIC, 32));
            streetText.setSize(250, 40);
            streetText.setLocation(200, 90);
            streetText.setText(streetChange);
            streetText.setEditable(false);
            cityText.setFont(new Font("Arial", Font.ITALIC, 32));
            cityText.setSize(250, 40);
            cityText.setLocation(200, 140);
            cityText.setText(cityChange);
            cityText.setEditable(false);
            pinNumber.setFont(new Font("Arial", Font.ITALIC, 32));
            pinNumber.setSize(250, 40);
            pinNumber.setLocation(200, 190);
            pinNumber.setText(pinChange);
            pinNumber.setEditable(false);
        }
    }
}

public class MyInfoSwing {
    public static void main(String[] args) throws Exception {
        Info info = new Info();
        info.setTitle("My Info");
        info.setBounds(200, 100, 500, 500);
        info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        info.setResizable(false);
        info.setVisible(true);
    }
}
