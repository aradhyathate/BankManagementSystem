package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class miniStatement extends JFrame implements ActionListener {

    String pin;

    JLabel label1, label2, label3, label4;

    JButton button;

    miniStatement(String pin) {
        this.pin = pin;

        super("ATM Machine");

        // To set Background Color of Frame
        getContentPane().setBackground(new Color(222, 225, 228));
        setLayout(null);
        setLocation(100, 20);
        setSize(1000, 600);

        label1 = new JLabel();
        label1.setBounds(20, 40, 500, 400);
        add(label1);

        label2 = new JLabel("Aradhya Thate");
        label2.setBounds(150, 20, 200, 35);
        label2.setFont(new Font("System", Font.BOLD, 16));
        add(label2);

        label3 = new JLabel();
        label3.setBounds(20, 80, 500,40);
        add(label3);

        label4 = new JLabel();
        label4.setBounds(20, 420, 300, 40);
        add(label4);

        try {
            Con c = new Con();

            String q = "select * from login where pin = '"+pin+"'";
            ResultSet resultSet = c.statement.executeQuery(q);

            while (resultSet.next()) {
                label3.setText("Card Number : " + resultSet.getString("card_number").substring(0, 4) +
                        "XXXXXXXXXXXX" + resultSet.getString("card_number").substring(12));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int balance = 0;

            Con c = new Con();

            String q = "select * from bank where pin = '"+pin+"'";
            ResultSet resultSet = c.statement.executeQuery(q);

            while (resultSet.next()) {

                label1.setText(label1.getText() + "<html>" + resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                        + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"
                        + resultSet.getString("amoutn") + "<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amoutn"));
                }
                else {
                    balance -= Integer.parseInt(resultSet.getString("amoutn"));
                }
            }

            label4.setText("Your Total Balance Rs. " + balance);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBounds(20, 500, 200, 25);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.WHITE);
        button.addActionListener(this);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);
    }

    public static void main(String[] args) {
        new miniStatement("");
    }
}
