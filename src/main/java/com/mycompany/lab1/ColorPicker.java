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
public class ColorPicker{
    static Color colour;
    static JPanel panel;
    static JFrame frame;


    public static void main(String[] args) {
        panel = new JPanel();

        JButton btn = new JButton("Change");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colour = JColorChooser.showDialog(frame, "choose",colour);
                // colour = colour == null ? Color.LIGHT_GRAY : colour;
                panel.setBackground(colour);
        
            }
            
        });

        panel.add(btn);
        frame = new JFrame("l1q1");
        frame.add(panel);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
