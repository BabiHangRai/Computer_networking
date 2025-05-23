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
import java.awt.*;
import java.awt.event.*;

public class Userform {
    public static void main(String[] args) {
      
        JFrame frame = new JFrame("User Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(140, 30, 200, 25);
        
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(30, 70, 100, 25);
        JTextField addressField = new JTextField();
        addressField.setBounds(140, 70, 200, 25);
        
        JLabel levelLabel = new JLabel("Level:");
        levelLabel.setBounds(30, 110, 100, 25);
        JTextField levelField = new JTextField();
        levelField.setBounds(140, 110, 200, 25);
        
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(140, 150, 100, 30);
        
        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String address = addressField.getText();
                String level = levelField.getText();
                openResultForm(name, address, level);
            }
        });

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(levelLabel);
        frame.add(levelField);
        frame.add(submitButton);

        
        frame.setVisible(true);
    }

    private static void openResultForm(String name, String address, String level) {
        JFrame resultFrame = new JFrame("User Information");
        resultFrame.setSize(350, 200);
        resultFrame.setLayout(null);

        JLabel resultLabel = new JLabel("User: " + name + ", Address: " + address + ", Level: " + level);
        resultLabel.setBounds(20, 50, 300, 25);
        resultFrame.add(resultLabel);

        resultFrame.setVisible(true);
    }
}


