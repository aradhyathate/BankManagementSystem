package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {

    String pin;

    JLabel l1;

    JButton button1, button2, button3, button4, button5, button6, button7, button8;

    main_class(String pin) {

        this.pin = pin;

        super("ATM Machine");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        l1 = new JLabel("Please Select Your Transaction");
        l1.setBounds(430, 180, 700, 35);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Raleway", Font.BOLD, 28));
        image.add(l1);

        button1 = new JButton("DEPOSIT");
        button1.setForeground(Color.BLACK);
        button1.setBackground(Color.WHITE);
        button1.setBounds(420, 270, 150, 35);
        button1.addActionListener(this);
        image.add(button1);

        button2 = new JButton("CASH WITHDRAWL");
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.WHITE);
        button2.setBounds(700, 270, 150, 35);
        button2.addActionListener(this);
        image.add(button2);

        button3 = new JButton("FAST CASH");
        button3.setForeground(Color.BLACK);
        button3.setBackground(Color.WHITE);
        button3.setBounds(420, 315, 150, 35);
        button3.addActionListener(this);
        image.add(button3);

        button4 = new JButton("MINI STATEMENT");
        button4.setForeground(Color.BLACK);
        button4.setBackground(Color.WHITE);
        button4.setBounds(700, 315, 150, 35);
        button4.addActionListener(this);
        image.add(button4);

        button5 = new JButton("PIN CHANGE");
        button5.setForeground(Color.BLACK);
        button5.setBackground(Color.WHITE);
        button5.setBounds(420, 360, 150, 35);
        button5.addActionListener(this);
        image.add(button5);

        button6 = new JButton("BALANCE ENQUIRY");
        button6.setForeground(Color.BLACK);
        button6.setBackground(Color.WHITE);
        button6.setBounds(700, 360, 150, 35);
        button6.addActionListener(this);
        image.add(button6);

        button7 = new JButton("BANK TRANSFER");
        button7.setForeground(Color.BLACK);
        button7.setBackground(Color.WHITE);
        button7.setBounds(420, 405, 150, 35);
        button7.addActionListener(this);
        image.add(button7);

        button8 = new JButton("EXIT");
        button8.setForeground(Color.BLACK);
        button8.setBackground(Color.WHITE);
        button8.setBounds(700, 405, 150, 35);
        button8.addActionListener(this);
        image.add(button8);

        setLayout(null);
        setLocation(0, 0);
        setSize(1550, 1080);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            new deposit(pin);
            setVisible(false);
        }
        else if (e.getSource() == button8) {
            // To stop program
            System.exit(0);
        }
        else if (e.getSource() == button2) {
            new withdrawl(pin);
            setVisible(false);
        }
        else if (e.getSource() == button6) {
            new balanceEnquiry(pin);
            setVisible(false);
        }
        else if (e.getSource() == button3) {
            new fastCash(pin);
            setVisible(false);
        }
        else if (e.getSource() == button5) {
            new changePin(pin);
            setVisible(false);
        }
        else if (e.getSource() == button4) {
            new miniStatement(pin);
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new main_class("");
    }
}