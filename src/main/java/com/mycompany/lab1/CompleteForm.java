/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author HP
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CompleteForm implements ActionListener {
    JLabel header, lblname, lblemail, lblnumber, lblmessage, lblcheck;
    JTextField txtname, txtemail;
    JComboBox<String> cmbnum;
    JCheckBox chkyes;
    JTextArea txtarea;
    JButton btnsubmit;
    JFrame frame;
    JPanel panel;
    String select, text;

    public void setForm() {
        header = new JLabel("Form");
        Font font = new Font("Courier", Font.BOLD, 24);
        header.setFont(font);

        lblname = new JLabel("Name");
        lblemail = new JLabel("Email");
        lblnumber = new JLabel("Select Number");
        lblmessage = new JLabel("Message");

        txtname = new JTextField();
        txtemail = new JTextField();
        String s[] = {"1", "2", "3", "4", "5"};
        cmbnum = new JComboBox<>(s);

        txtarea = new JTextArea();
        chkyes = new JCheckBox("Yes / NO");

        btnsubmit = new JButton("Submit Information");
        btnsubmit.addActionListener(this);

        header.setBounds(10, 0, 200, 30);
        lblname.setBounds(10, 40, 100, 25);
        txtname.setBounds(100, 40, 350, 25);
        lblemail.setBounds(10, 80, 100, 25);
        txtemail.setBounds(100, 80, 350, 25);
        lblnumber.setBounds(10, 120, 100, 25);
        cmbnum.setBounds(100, 120, 350, 25);
        lblmessage.setBounds(10, 160, 100, 25);
        txtarea.setBounds(100, 160, 350, 150);

        chkyes.setBounds(100, 320, 100, 25);
        btnsubmit.setBounds(100, 360, 150, 30);
        btnsubmit.setToolTipText("Submit");

        frame = new JFrame("Registration Form.....");
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(header);
        panel.add(lblname);
        panel.add(lblemail);
        panel.add(lblnumber);
        panel.add(lblmessage);
        panel.add(txtname);
        panel.add(txtemail);
        panel.add(cmbnum);
        panel.add(txtarea);
        panel.add(chkyes);
        panel.add(btnsubmit);

        frame.getContentPane().add(panel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void newForm() {
        header = new JLabel("Registered Data");
        Font font = new Font("Courier", Font.BOLD, 24);
        header.setFont(font);

        lblname = new JLabel("Name");
        lblemail = new JLabel("Email");
        lblnumber = new JLabel("Number");
        lblmessage = new JLabel("Message");
        lblcheck = new JLabel("Checkbox");

        JLabel lname = new JLabel();
        JLabel lemail = new JLabel();
        JLabel lnumber = new JLabel();
        JLabel lmsg = new JLabel();
        JLabel lchkbox = new JLabel();

        header.setBounds(10, 0, 200, 30);
        lblname.setBounds(10, 40, 100, 25);
        lname.setBounds(100, 40, 350, 25);
        lblemail.setBounds(10, 80, 100, 25);
        lemail.setBounds(100, 80, 350, 25);
        lblnumber.setBounds(10, 120, 100, 25);
        lnumber.setBounds(100, 120, 350, 25);
        lblmessage.setBounds(10, 160, 100, 25);
        lmsg.setBounds(100, 160, 350, 25);
        lblcheck.setBounds(10, 200, 100, 25);
        lchkbox.setBounds(100, 200, 100, 25);

        lname.setText(txtname.getText());
        lemail.setText(txtemail.getText());
        lnumber.setText(cmbnum.getSelectedItem().toString());
        lmsg.setText(txtarea.getText());
        lchkbox.setText(select);

        frame = new JFrame("Registration Form.....");
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(header);
        panel.add(lblname);
        panel.add(lblemail);
        panel.add(lblnumber);
        panel.add(lblmessage);
        panel.add(lblcheck);
        panel.add(lname);
        panel.add(lemail);
        panel.add(lnumber);
        panel.add(lmsg);
        panel.add(lchkbox);

        frame.getContentPane().add(panel);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnsubmit)) {
            JOptionPane.showMessageDialog(frame, "Successfully Registered");
            if (chkyes.isSelected())
                select = "yes";
            else
                select = "no";
            text = txtarea.getText();
            newForm();
        }
    }

    public static void main(String[] args) {
        new CompleteForm().setForm();
    }
}
