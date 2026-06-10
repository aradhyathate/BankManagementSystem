package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class changePin extends JFrame implements ActionListener {
    String pin;

    JLabel l1, l2, l3;

    JButton change, back;

    JPasswordField p1, p2;

    changePin(String pin) {

        super("ATM Machine");

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        l1 = new JLabel("CHANGE YOUR PIN : ");
        l1.setForeground(Color.WHITE);
        l1.setBounds(430, 120, 700, 35);
        l1.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(l1);

        l2 = new JLabel("NEW PIN : ");
        l2.setForeground(Color.WHITE);
        l2.setBounds(430, 180, 700, 35);
        l2.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(l2);

        p1 = new JPasswordField();
        p1.setForeground(Color.BLACK);
        p1.setBackground(Color.WHITE);
        p1.setBounds(610, 180, 200, 35);
        p1.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(p1);

        l3 = new JLabel("RE-ENTER NEW PIN : ");
        l3.setForeground(Color.WHITE);
        l3.setBounds(430, 240, 700, 35);
        l3.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(l3);

        p2 = new JPasswordField();
        p2.setForeground(Color.BLACK);
        p2.setBackground(Color.WHITE);
        p2.setBounds(610, 240, 200, 35);
        p2.setFont(new Font("Raleway", Font.BOLD, 22));
        image.add(p2);

        change = new JButton("CHANGE");
        change.setForeground(Color.BLACK);
        change.setBackground(Color.WHITE);
        change.setBounds(700, 360, 150, 35);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setForeground(Color.BLACK);
        back.setBackground(Color.WHITE);
        back.setBounds(700, 410, 150 ,35);
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
           String pin1 = p1.getText();
           String pin2 = p2.getText();

           if (!pin1.equals(pin2)) {
               JOptionPane.showMessageDialog(null, "Pin does not match");
               return; // return is used to stop the execution of the program
           }

           if (e.getSource() == change) {
                if (p1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter new PIN");
                    return; // return is used to stop the execution of the program
                }

                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                    return; // return is used to stop the execution of the program
                }

                // We store PIN in bank,login,signUp3 tabel in database
                Con c = new Con();

                // To update table in bank database
               // update PIN column with pin1 text where PIN is equal to oldPIN
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";

                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";

                String q3 = "update signup3 set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN change successfully");
                setVisible(false);
                new main_class(pin);
           }
           else if (e.getSource() == back) {
               new main_class(pin);
               setVisible(false);
           }
        }
        catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new changePin("");
    }
}
