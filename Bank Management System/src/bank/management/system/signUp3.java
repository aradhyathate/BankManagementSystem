package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class signUp3 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;

    JRadioButton rAccountDetails1, rAccountDetails2, rAccountDetails3, rAccountDetails4;

    JCheckBox checkBoxService1, checkBoxService2, checkBoxService3, checkBoxService4,
            checkBoxService5, checkBoxService6, checkBoxFinal;

    JButton submit, cancel;

    String formno;

    signUp3(String formno) {
        super("Application Form");

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        l1 = new JLabel("Page 3 : ");
        l1.setBounds(280, 40, 600, 60);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        l2 = new JLabel("Account Details : ");
        l2.setBounds(280, 80, 600, 30);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l2);

        l3 = new JLabel("Account Type : ");
        l3.setBounds(50, 120, 600, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l3);

        rAccountDetails1 = new JRadioButton("Saving Account");
        rAccountDetails1.setBackground(new Color(222, 225, 228));
        rAccountDetails1.setBounds(50, 150, 150, 30);
        rAccountDetails1.setFont(new Font("Raleway", Font.BOLD, 16));
        add(rAccountDetails1);

        rAccountDetails2 = new JRadioButton("Fixed Deposit Account");
        rAccountDetails2.setBackground(new Color(222, 225, 228));
        rAccountDetails2.setBounds(50, 180, 200, 30);
        rAccountDetails2.setFont(new Font("Raleway", Font.BOLD, 16));
        add(rAccountDetails2);

        rAccountDetails3 = new JRadioButton("Current Account");
        rAccountDetails3.setBackground(new Color(222, 225, 228));
        rAccountDetails3.setBounds(350, 150, 160, 30);
        rAccountDetails3.setFont(new Font("Raleway", Font.BOLD, 16));
        add(rAccountDetails3);

        rAccountDetails4 = new JRadioButton("Recurring Deposit Account");
        rAccountDetails4.setBackground(new Color(222, 225, 228));
        rAccountDetails4.setBounds(350, 180, 300, 30);
        rAccountDetails4.setFont(new Font("Raleway", Font.BOLD, 16));
        add(rAccountDetails4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rAccountDetails1);
        buttonGroup1.add(rAccountDetails2);
        buttonGroup1.add(rAccountDetails3);
        buttonGroup1.add(rAccountDetails4);

        l4 = new JLabel("Card Number : ");
        l4.setBounds(50, 220, 600, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l4);

        l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setBounds(50, 250, 600, 30);
        l5.setFont(new Font("Raleway", Font.BOLD, 16));
        add(l5);

        l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setBounds(350, 220, 600,30);
        l6.setFont(new Font("Raleway", Font.BOLD, 16));
        add(l6);

        l7 = new JLabel("(It would appear on ATM card/Cheque Book & Statements)");
        l7.setBounds(350, 250, 600, 30);
        l7.setFont(new Font("Raleway", Font.BOLD, 16));
        add(l7);

        l8 = new JLabel("PIN : ");
        l8.setBounds(50, 300, 600, 30);
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l8);

        l9 = new JLabel("(XXXX)");
        l9.setBounds(350, 300, 600, 30);
        l9.setFont(new Font("Raleway", Font.BOLD, 16));
        add(l9);

        l10 = new JLabel("(4-digit password)");
        l10.setBounds(350, 330, 600, 30);
        l10.setFont(new Font("Raleway", Font.BOLD, 16));
        add(l10);

        l11 = new JLabel("Service Required : ");
        l11.setBounds(50, 360, 600, 30);
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l11);

        checkBoxService1 = new JCheckBox("ATM CARD");
        checkBoxService1.setBackground(new Color(222, 225, 228));
        checkBoxService1.setBounds(50, 390, 150, 30);
        checkBoxService1.setFont(new Font("Raleway", Font.BOLD, 16));
        add(checkBoxService1);

        checkBoxService2 = new JCheckBox("Internet Banking");
        checkBoxService2.setBackground(new Color(222, 225, 228));
        checkBoxService2.setBounds(330, 390, 200, 30);
        checkBoxService2.setFont(new Font("Raleway", Font.BOLD, 16));
        add(checkBoxService2);

        checkBoxService3 = new JCheckBox("UPI");
        checkBoxService3.setBackground(new Color(222, 225, 228));
        checkBoxService3.setBounds(50, 420, 100, 30);
        checkBoxService3.setFont(new Font("Raleway", Font.BOLD, 16));
        add(checkBoxService3);

        checkBoxService4 = new JCheckBox("Message Alerts");
        checkBoxService4.setBackground(new Color(222, 225, 228));
        checkBoxService4.setBounds(330, 420, 200, 30);
        checkBoxService4.setFont(new Font("Raleway", Font.BOLD, 16));
        add(checkBoxService4);

        checkBoxService5 = new JCheckBox("Cheque Book");
        checkBoxService5.setBackground(new Color(222, 225, 228));
        checkBoxService5.setBounds(50, 450, 200, 30);
        checkBoxService5.setFont(new Font("Raleway", Font.BOLD, 16));
        add(checkBoxService5);

        checkBoxService6 = new JCheckBox("Bank Statements");
        checkBoxService6.setBackground(new Color(222, 225, 228));
        checkBoxService6.setBounds(330, 450, 200, 30);
        checkBoxService6.setFont(new Font("Raleway", Font.BOLD, 16));
        add(checkBoxService6);

        checkBoxFinal = new JCheckBox("I here by declare that the above entered details are correct to the best of my knowledge");
        checkBoxFinal.setBackground(new Color(222, 225, 228));
        checkBoxFinal.setBounds(50, 500, 800, 30);
        checkBoxFinal.setFont(new Font("Raleway", Font.BOLD, 16));
        add(checkBoxFinal);

        l12 = new JLabel("Form No. : ");
        l12.setBounds(260, 10, 600, 30);
        l12.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l12);

        l13 = new JLabel(formno);
        l13.setBounds(360, 10, 600, 30);
        l13.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l13);

        submit = new JButton("Submit");
        submit.setForeground(Color.BLACK);
        submit.setBackground(Color.WHITE);
        submit.setBounds(180, 550, 100, 30);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setForeground(Color.BLACK);
        cancel.setBackground(Color.WHITE);
        cancel.setBounds(400, 550, 100, 30);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(new Color(222, 225, 228));
        setLayout(null);
        setSize(850, 900);
        setLocation(450, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accounttype = null;
        if(rAccountDetails1.isSelected()) {
            accounttype = "Saving ACcount";
        }
        else if (rAccountDetails2.isSelected()) {
            accounttype = "Current Account";
        }
        else if (rAccountDetails3.isSelected()) {
            accounttype = "Fixed Deposit Account";
        }
        else if (rAccountDetails4.isSelected()) {
            accounttype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() & 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String service = null;
        if (checkBoxService1.isSelected()) {
            service = service + "ATM Card";
        }
        else if (checkBoxService2.isSelected()) {
            service = service + "Internet Banking";
        }
        else if (checkBoxService3.isSelected()) {
            service = service + "UPI";
        }
        else if (checkBoxService4.isSelected()) {
            service = service + "Message Alerts";
        }
        else if (checkBoxService6.isSelected()) {
            service = service + "Cheque Book";
        }
        else if (checkBoxService6.isSelected()) {
            service = service + "Bank Statement";
        }

//        String checkBox = null;
//        if (checkBoxFinal.isSelected()) {
//            checkBox = checkBox + "I here by declare that the above entered details are correct to the best of my knowledge";
//        }
//        else {
//            JOptionPane.showMessageDialog(null, "Please agree to the terms and conditions");
//        }

        try{
            if (e.getSource() == submit) {
                if (accounttype == null || accounttype.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Select Account Type");
                }
                else {
                    Con con1 = new Con();
                    String q1 = "insert into signup3 values('" + formno + "', '" + accounttype + "', '" + cardno + "', '" + pin + "', '" + service + "')";
                    String q2 = "insert into login values('" + formno + "', '" + cardno + "', '" + pin + "')";

                    // executeUpdate is use to send/add data into database
                    con1.statement.executeUpdate(q1);
                    con1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number = " + cardno + "\n Pin = " + pin);

                    // To pass PIN no. in deposit class
                    new deposit(pin);

                    setVisible(false);
                }
            }
            else if (e.getSource() == cancel) {
                System.exit(0);
            }
        }
        catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new signUp3("");
    }
}
