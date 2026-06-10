package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposit extends JFrame implements ActionListener {

    String pin;

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;

    JTextField textField;

    JButton deposit, back;

    deposit (String pin) {
        this.pin = pin;

        super("ATM Machine");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 1000);
        add(image);

        l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setBounds(460, 180, 400, 35);
        l1.setFont(new Font("Raleway", Font.BOLD, 16));

        // To show text on the image.
        image.add(l1);

        textField = new JTextField("");
        textField.setBounds(460, 230, 320, 25);
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(textField);

        deposit = new JButton("DEPOSIT");
        deposit.setBackground(Color.WHITE);
        deposit.setForeground(Color.BLACK);
        deposit.setBounds(700, 450, 150, 35);
        deposit.setFont(new Font("Raleway", Font.BOLD, 14));
        deposit.addActionListener(this);
        image.add(deposit);

        back = new JButton("BACK");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(700, 500, 150, 35);
        back.setFont(new Font("Raleway", Font.BOLD, 14));
        back.addActionListener(this);
        image.add(back);

        setLayout(null);
        setSize(1550, 1000);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String amount = textField.getText();
            Date date = new Date();


            if (e.getSource() == deposit) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter Deposit Amount");
                }
                else {
                    Con con1 = new Con();
                    String q = "insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')";
                    con1.statement.executeUpdate(q);

                    // To show message that amount is deposit successfully
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Deposit Successfully");

                    setVisible(false);
                    new main_class(pin);
                }
            }
            else if (e.getSource() == back ) {
                setVisible(false);
                new main_class(pin);

            }
        }
        catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        // Resolve error after taking pin from signup3 class we have to pass an empty string
        // to avoid null pointer exception in new deposit();
        new deposit("");
    }

}