package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener {

    String pin;

    JLabel l1;

    JTextField textField;

    JButton withdrawl, back;

    withdrawl(String pin) {

        this.pin = pin;

        super("ATM Machine");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 1000);
        add(image);

        JLabel l1 = new JLabel("MAXIMUM WITHDRAWL IS RS. 10,000");
        l1.setForeground(Color.WHITE);
        l1.setBounds(460, 180, 400, 35);
        l1.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(l1);

        textField = new JTextField();
        textField.setForeground(Color.BLACK);
        textField.setBackground(Color.WHITE);
        textField.setBounds(470, 230, 320, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(textField);

        withdrawl = new JButton("WITHDRAWL");
        withdrawl.setForeground(Color.BLACK);
        withdrawl.setBackground(Color.WHITE);
        withdrawl.setBounds(700, 450, 150, 35);
        withdrawl.setFont(new Font("Raleway", Font.BOLD, 16));
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        back = new JButton("BACK");
        back.setForeground(Color.BLACK);
        back.setBackground(Color.WHITE);
        back.setBounds(700, 500, 150, 35);
        back.setFont(new Font("Raleway", Font.BOLD, 16));
        back.addActionListener(this);
        image.add(back);

        setLayout(null);
        setLocation(0, 0);
        setSize(1550, 1000);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();

            if (e.getSource() == withdrawl) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter Withdrawl Amount");
                }
                else {
                    Con con1 = new Con();
                    String q1 = "select * from bank where pin = '"+pin+"'";

                    // Retrieve value from the database
                    ResultSet resultSet = con1.statement.executeQuery(q1);

                    int balance = 0;

                    // resultSte.next() means data is present in table with random pin
                    while (resultSet.next()) {

                        // This condition is use to check whether the "type" column in bank database is equals to "Deposit"
                        // if true then balance = Deposit amount
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amoutn")); // amount column in bank database
                        }
                        else {
                            // If not then balance = deposit - amount
                            balance -= Integer.parseInt(resultSet.getString("amoutn"));
                        }
                    }

                    // If amount is large than balance then show message
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    // To store withdrawl data in bank database
                    String q2 = "insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')";

                    // string q2 amount is that which use withdrawl

                    con1.statement.executeUpdate(q2);

                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Withdrawl Successfully");

                    setVisible(false);
                    new main_class(pin);
                }
            }
            else if (e.getSource() == back) {
                setVisible(false);
                new main_class(pin);
            }
        }
        catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new withdrawl("");
    }
}
