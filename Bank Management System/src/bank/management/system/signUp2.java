package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signUp2 extends JFrame implements ActionListener {
    String formno;

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;

    JTextField textPan, textAadhar;

    JComboBox comboBox1, comboBox2, comboBox3, comboBox4, comboBox5; // To create DropDown menu

    JRadioButton rSeniorCitizen1, rSeniorCitizen2, rExistingAccount1, rExistingAccount2;

    JButton next;

    signUp2(String formno) { // parameter constructor is used because in signUp1 we pass first in signUp2 class
        super("APPLICATION FORM : ");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;

        l1 = new JLabel("PAGE 2 : ");
        l1.setBounds(330, 30, 600, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        l2 = new JLabel("ADDITIONAL DETAILS : ");
        l2.setBounds(330, 60, 600, 40);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l2);

        l3 = new JLabel("Religion : ");
        l3.setBounds(50, 120, 600, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l3);

        String[] religion = {"Hindu", "Muslim", "Sikh", "Jain", "Christian", "other"};
        comboBox1 = new JComboBox(religion); // To create DropDown menu
        comboBox1.setBounds(200, 120, 350, 30);
        comboBox1.setBackground(new Color(222, 225, 228));
        comboBox1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox1);

        l4 = new JLabel("Category : ");
        l4.setBounds(50, 180, 600, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l4);

        String[] category = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBounds(200, 180, 350, 30);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBackground(new Color(222, 225, 228));
        add(comboBox2);

        l5 = new JLabel("Income : ");
        l5.setBounds(50, 240, 600, 30);
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l5);

        String[] income = {"0", "<50000", "<200000", "<800000", "Upto 1200000", "Above 2000000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBounds(200, 240, 350, 30);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBackground(new Color(222, 225, 228));
        add(comboBox3);

        l6 = new JLabel("Education : ");
        l6.setBounds(50, 300, 600, 30);
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l6);

        String[] education = {"Higher Secondry", "UnderGraduate", "PostGraduate","Doctor", "PhD"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBounds(200, 300, 350, 30);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBackground(new Color(222, 225, 228));
        add(comboBox4);

        l7 = new JLabel("Occupation : ");
        l7.setBounds(50, 360, 600, 30);
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l7);

        String[] occupation = {"Salaried", "Self-Employed", "Bussiness", "Student", "Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBounds(200, 360, 350, 30);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBackground(new Color(222, 225, 228));
        add(comboBox5);

        l8 = new JLabel("Aadhar No. : ");
        l8.setBounds(50, 420, 600, 30);
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l8);

        textAadhar = new JTextField();
        textAadhar.setBounds(200, 420, 350, 30);
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textAadhar);

        l9 = new JLabel("Pancard No. : ");
        l9.setBounds(50, 480, 600, 30);
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l9);

        textPan = new JTextField();
        textPan.setBounds(200, 480, 350, 30);
        textPan.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textPan);

        l10 = new JLabel("Senior Citizen : ");
        l10.setBounds(50, 520, 600, 30);
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l10);

        rSeniorCitizen1 = new JRadioButton("Yes");
        rSeniorCitizen1.setBounds(200, 520, 60, 30);
        rSeniorCitizen1.setFont(new Font("Raleway", Font.BOLD, 14));
        rSeniorCitizen1.setBackground(new Color(222, 225, 228));
        add(rSeniorCitizen1);

        rSeniorCitizen2 = new JRadioButton("No");
        rSeniorCitizen2.setBounds(300, 520, 60, 30);
        rSeniorCitizen2.setFont(new Font("Raleway", Font.BOLD, 14));
        rSeniorCitizen2.setBackground(new Color(222, 225, 228));
        add(rSeniorCitizen2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rSeniorCitizen1);
        buttonGroup1.add(rSeniorCitizen2);

        l11 = new JLabel("Existing Account : ");
        l11.setBounds(50, 560, 600, 30);
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l11);

        rExistingAccount1 = new JRadioButton("Yes");
        rExistingAccount1.setBounds(230, 560, 60, 30);
        rExistingAccount1.setFont(new Font("Raleway", Font.BOLD, 14));
        rExistingAccount1.setBackground(new Color(222, 225, 228));
        add(rExistingAccount1);

        rExistingAccount2 = new JRadioButton("No");
        rExistingAccount2.setBounds(300, 560, 60, 30);
        rExistingAccount2.setFont(new Font("Raleway", Font.BOLD, 14));
        rExistingAccount2.setBackground(new Color(222, 225, 228));
        add(rExistingAccount2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(rExistingAccount1);
        buttonGroup2.add(rExistingAccount2);

        l12 = new JLabel("Form No. : ");
        l12.setBounds(330, 10, 600, 30);
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l12);

        l13 = new JLabel(formno);
        l13.setBounds(330, 10, 600, 30);
        l13.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l13);

        next = new JButton("Next");
        next.setBounds(450, 600, 100, 30);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(222, 225, 228));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String religion = (String) comboBox1.getSelectedItem();
        String category = (String) comboBox2.getSelectedItem();
        String income = (String) comboBox3.getSelectedItem();
        String education = (String) comboBox4.getSelectedItem();
        String occupation = (String) comboBox5.getSelectedItem();
        String aadharcard = textAadhar.getText();
        String pancard = textPan.getText();

        String seniorcitizen = null;
        if(rSeniorCitizen1.isSelected()) {
            seniorcitizen = "Yes";
        }
        else if (rSeniorCitizen2.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if (rExistingAccount1.isSelected()) {
            existingaccount = "Yes";
        }
        else if (rExistingAccount2.isSelected()) {
            existingaccount = "No";
        }


        try {
            if (textAadhar.getText().equals("") || textPan.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields accurately");
            }
            else {
                Con con1 = new Con();
                String q = "insert into signup2 values('"+formno+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+aadharcard+"', '"+pancard+"', '"+seniorcitizen+"', '"+existingaccount+"')";

                // When we want to insert data into database table
                con1.statement.executeUpdate(q);

                new signUp3(formno);

                setVisible(false);

            }
        }
        catch(Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new signUp2("");
    }


}
