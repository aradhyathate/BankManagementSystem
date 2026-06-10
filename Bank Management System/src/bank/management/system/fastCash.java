package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fastCash extends JFrame implements ActionListener {

    String pin;

    JLabel l1;

    JButton button1, button2, button3, button4, button5, button6, button7;

    fastCash(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 1000);
        add(image);

        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setForeground(Color.WHITE);
        l1.setBounds(455, 200, 700, 35);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(l1);

        button1 = new JButton("Rs. 100");
        button1.setForeground(Color.BLACK);
        button1.setBackground(Color.WHITE);
        button1.setBounds(420, 320, 150, 35);
        button1.addActionListener(this);
        image.add(button1);

        button2 = new JButton("Rs. 500");
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.WHITE);
        button2.setBounds(700, 320, 150, 35);
        button2.addActionListener(this);
        image.add(button2);

        button3 = new JButton("Rs. 1000");
        button3.setForeground(Color.BLACK);
        button3.setBackground(Color.WHITE);
        button3.setBounds(420, 380, 150, 35);
        button3.addActionListener(this);
        image.add(button3);

        button4 = new JButton("Rs. 2000");
        button4.setForeground(Color.BLACK);
        button4.setBackground(Color.WHITE);
        button4.setBounds(700, 380, 150, 35);
        button4.addActionListener(this);
        image.add(button4);

        button5 = new JButton("Rs. 5000");
        button5.setForeground(Color.BLACK);
        button5.setBackground(Color.WHITE);
        button5.setBounds(420, 440, 150, 35);
        button5.addActionListener(this);
        image.add(button5);

        button6 = new JButton("Rs. 10000");
        button6.setForeground(Color.BLACK);
        button6.setBackground(Color.WHITE);
        button6.setBounds(700, 440, 150, 35);
        button6.addActionListener(this);
        image.add(button6);

        button7 = new JButton("Back");
        button7.setForeground(Color.BLACK);
        button7.setBackground(Color.WHITE);
        button7.setBounds(700, 495, 150, 35);
        button7.addActionListener(this);
        image.add(button7);

        setLayout(null);
        setLocation(0, 0);
        setSize(1550, 1000);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button7) {
            setVisible(false);
            new main_class(pin);
        }
        else {
            // (JButton).getSource() is use to get all buttons
            // getText() is use to get text of button
            //subString(4) is use to take text from index 4
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Con con1 = new Con();
            Date date = new Date();

            try {
                String q1 = "select * from bank where pin = '"+pin+"'";
                ResultSet resultSet  = con1.statement.executeQuery(q1);

                int balance = 0;
                while (resultSet.next()) {
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amoutn"));
                    }
                    else {
                        balance -= Integer.parseInt(resultSet.getString("amoutn"));
                    }

                    String num = "17";

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                }

                String q2 = "insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                con1.statement.executeUpdate(q2);

                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Withdrawl Successfully");

            }
            catch (Exception E) {
                E.printStackTrace();
            }

            setVisible(false);
            new main_class(pin);
        }
    }


    public static void main(String[] args) {
        new fastCash("");
    }
}
