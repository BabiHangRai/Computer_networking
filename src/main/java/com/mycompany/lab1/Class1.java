/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author HP
 */
import javax.swing.*;
import java.awt.event.*;

public class Class1 implements ActionListener {
    JLabel lblname, lbladdress, lbllevel;
    JTextField txtname, txtaddress, txtlevel;
    JButton btnregister;
    JFrame frame;
    JPanel panel;

    void createForm() {
        frame = new JFrame("Data Entry Form");
        panel = new JPanel();
        panel.setLayout(null);

        lblname = new JLabel("Name:");
        lbladdress = new JLabel("Address:");
        lbllevel = new JLabel("Level:");

        txtname = new JTextField();
        txtaddress = new JTextField();
        txtlevel = new JTextField();

        btnregister = new JButton("Register");
        btnregister.addActionListener(this);

        
        lblname.setBounds(10, 20, 80, 35);
        lbladdress.setBounds(10, 60, 80, 35);
        lbllevel.setBounds(10, 100, 80, 35);
        txtname.setBounds(100, 20, 160, 35);
        txtaddress.setBounds(100, 60, 160, 35);
        txtlevel.setBounds(100, 100, 160, 35);
        btnregister.setBounds(100, 150, 100, 35);

        
        panel.add(lblname);
        panel.add(txtname);
        panel.add(lbladdress);
        panel.add(txtaddress);
        panel.add(lbllevel);
        panel.add(txtlevel);
        panel.add(btnregister);

        
        frame.add(panel);
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnregister) {
            String name = txtname.getText();
            String address = txtaddress.getText();
            String level = txtlevel.getText();
            JOptionPane.showMessageDialog(frame, "Information Recorded:\nName: " + name + "\nAddress: " + address + "\nLevel: " + level);
        }
    }

    public static void main(String[] args) {
        Class1 form = new Class1();
        form.createForm();
    }
}

