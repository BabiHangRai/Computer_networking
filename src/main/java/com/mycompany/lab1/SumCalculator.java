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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SumCalculator {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Sum Calculator");
        frame.setLayout(new FlowLayout());

        // Add a prompt label
        frame.add(new JLabel("Enter a number:"));

        // Add the textbox for number input
        JTextField textField = new JTextField(10); // 10 columns wide
        frame.add(textField);

        // Add the label to display the sum
        JLabel sumLabel = new JLabel("Sum: ");
        frame.add(sumLabel);

        // Attach a KeyListener to the textbox
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String text = textField.getText();
                try {
                    int n = Integer.parseInt(text);
                    if (n < 0) {
                        sumLabel.setText("Invalid input");
                    } else {
                        // Calculate sum of odd numbers
                        int sumOdds = ((n + 1) / 2) * ((n + 1) / 2);
                        sumLabel.setText("Sum of odds: " + sumOdds);
                    }
                } catch (NumberFormatException ex) {
                    sumLabel.setText("Invalid input");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String text = textField.getText();
                try {
                    int n = Integer.parseInt(text);
                    if (n < 0) {
                        sumLabel.setText("Invalid input");
                    } else {
                        // Calculate sum of even numbers
                        int sumEvens = (n / 2) * (n / 2 + 1);
                        sumLabel.setText("Sum of evens: " + sumEvens);
                    }
                } catch (NumberFormatException ex) {
                    sumLabel.setText("Invalid input");
                }
            }
        });

        // Configure the frame
        frame.setSize(300, 100); // Width: 300px, Height: 100px
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Make the window visible
    }
}
