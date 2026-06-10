package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    Random ran = new Random();

    long first4 = (ran.nextLong() % 9000L) + 1000L;

    String first = " " + Math.abs(first4);

    JLabel label1, label2, label3, labelName, labelFname, labelLname, DOB, labelG, labelEmail, labelMS,
            labelAddress, labelCity, labelPinCode, labelState;

    JTextField textName, textFname, textEmail, textAddress, textCity, textPinCode, textState,
            textLname;

    JDateChooser dateChooser;

    JRadioButton radioButton1G, radioButton2G, radioButton3G, radioButtonMS1, radioButtonMS2;
    // First 3 is for declare Gender, Second 2 for Married Status

    JButton next;

    SignUp() {
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        label1 = new JLabel("APPLICATION FORM NO. : " + first);
        label1.setBounds(150, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 30));
        add(label1);

        label2 = new JLabel("PAGE 1");
        label2.setBounds(330, 65, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        label3 = new JLabel("PERSONAL DETAILS : ");
        label3.setBounds(290, 100, 600, 30);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label3);

        labelName = new JLabel("Name : ");
        labelName.setBounds(100, 150, 100, 30);
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(300, 150, 400, 30);
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textName);

        labelFname = new JLabel("Father Name : ");
        labelFname.setBounds(100, 200, 200, 30);
        labelFname.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelFname);

        textFname = new JTextField();
        textFname.setBounds(300, 200, 400, 30);
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textFname);

        labelLname = new JLabel("Last Name : ");
        labelLname.setBounds(100, 250, 200, 30);
        labelLname.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelLname);

        textLname = new JTextField();
        textLname.setBounds(300, 250, 400, 30);
        textLname.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textLname);

        DOB = new JLabel("Date of Birth : ");
        DOB.setBounds(100, 300, 400, 30);
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 300, 400, 30);
        add(dateChooser);

        labelG = new JLabel("Gender : ");
        labelG.setBounds(100, 350, 400, 30);
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelG);

        radioButton1G = new JRadioButton("Male");
        radioButton1G.setBackground(new Color(222,225,228));
        radioButton1G.setBounds(300, 350, 60, 30);
        radioButton1G.setFont(new Font("Raleway", Font.BOLD, 14));
        add(radioButton1G);

        radioButton2G = new JRadioButton("Female");
        radioButton2G.setBackground(new Color(222,225,228));
        radioButton2G.setBounds(400, 350, 80, 30);
        radioButton2G.setFont(new Font("Raleway", Font.BOLD, 14));
        add(radioButton2G);

        radioButton3G = new JRadioButton("Other");
        radioButton3G.setBackground(new Color(222,225,228));
        radioButton3G.setBounds(520, 350, 80, 30);
        radioButton3G.setFont(new Font("Raleway", Font.BOLD, 14));
        add(radioButton3G);

        // To select only one "RADIO BUTTON" we have to use ButtonGroup class
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1G);
        buttonGroup1.add(radioButton2G);
        buttonGroup1.add(radioButton3G);

        labelEmail = new JLabel("EMAIL : ");
        labelEmail.setBounds(100, 400, 400, 30);
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(300, 400, 400, 30);
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textEmail);

        labelMS = new JLabel("Married Status : ");
        labelMS.setBounds(100, 450, 400, 30);
        labelMS.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelMS);

        radioButtonMS1 = new JRadioButton("Married");
        radioButtonMS1.setBackground(new Color(222,225,228));
        radioButtonMS1.setBounds(300, 450, 80, 30);
        radioButtonMS1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(radioButtonMS1);

        radioButtonMS2 = new JRadioButton("Unmarried");
        radioButtonMS2.setBackground(new Color(222,225,228));
        radioButtonMS2.setBounds(400, 435, 100, 60);
        radioButtonMS2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(radioButtonMS2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(radioButtonMS1);
        buttonGroup2.add(radioButtonMS2);

        labelAddress = new JLabel("Address : ");
        labelAddress.setBounds(100, 500, 400, 30);
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelAddress);

        textAddress = new JTextField();
        textAddress.setBounds(300, 500, 400,30);
        textAddress.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textAddress);

        labelCity = new JLabel("City : ");
        labelCity.setBounds(100, 550, 400, 30);
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(300, 550, 400, 30);
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textCity);

        labelPinCode = new JLabel("PINCODE : ");
        labelPinCode.setBounds(100, 600, 400, 30);
        labelPinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelPinCode);

        textPinCode = new JTextField();
        textPinCode.setBounds(300, 600, 400, 30);
        textPinCode.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textPinCode);

        labelState = new JLabel("State : ");
        labelState.setBounds(100, 650, 400, 30);
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelState);

        textState = new JTextField();
        textState.setBounds(300, 650, 400, 30);
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textState);

        next = new JButton("Next");
        next.setForeground(Color.BLACK);
        next.setBackground(Color.WHITE);
        next.setBounds(620, 685, 80, 30);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,225,228));
        setLayout(null);
        setSize(850, 900);
        setLocation(300, 5); // At which position of window this page will appear
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // This are taken to store all values in a single string to store in database
        // getText() is use to retrieve text value form JTextField
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String lname = textLname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if (radioButton1G.isSelected()){
            gender = "Male";
        }
        else if (radioButton2G.isSelected()){
            gender = "Female";
        }
        else if (radioButton3G.isSelected()) {
            gender = "Other";
        }

        String email = textEmail.getText();

        String marital = null;
        if (radioButtonMS1.isSelected()) {
            marital = "Married";
        }
        else if (radioButtonMS2.isSelected()) {
            marital = "Unmarried";
        }

        String address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPinCode.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields correctly");
            }
            else {
                // First store "Form No." in database because it is te first column in database
                // Then store all other values
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+lname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";

                // Use when we want to input value in inside table created in database
                con1.statement.executeUpdate(q);

                new signUp2(formno);  // When value are inserted go to the below class
                                     // first is the Form No in the form

                setVisible(false);  // To close this signUp1 form
            }
        }
        catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
