package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balanceEnquiry extends JFrame implements ActionListener {
    String pin;

    JLabel l1, l2;

    JButton back;

    balanceEnquiry(String pin) {
        this.pin = pin;

        super("ATM Machinne");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel l1 = new JLabel("Your Current Balance is Rs. : ");
        l1.setForeground(Color.WHITE);
        l1.setBounds(430, 180, 700, 35);
        l1.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(l1);

        l2 = new JLabel();
        l2.setForeground(Color.WHITE);
        l2.setBounds(430, 220, 400, 35);
        l2.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(l2);

        back = new JButton("Back");
        back.setForeground(Color.BLACK);
        back.setBackground(Color.WHITE);
        back.setBounds(700, 406, 150, 35);
        back.addActionListener(this);
        image.add(back);

        int balance = 0;
        try {
            Con c = new Con();
            String q = " select * from bank where pin = '"+pin+"'";
            ResultSet resultSet = c.statement.executeQuery(q);

            // resultSte.next() means data is present in table with random pin
            while (resultSet.next()) {

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amoutn"));
                }
                else {
                    balance -= Integer.parseInt(resultSet.getString("amoutn"));
                }
            }
        }
        catch (Exception E) {
            E.printStackTrace();
        }

        // "" is given because balance is integer datatype without "" it cause error
        l2.setText("" +balance);

        setLayout(null);
        setLocation(0,0);
        setSize(1550, 1000);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);
    }


    public static void main(String[] args) {
        new balanceEnquiry("");
    }
}
