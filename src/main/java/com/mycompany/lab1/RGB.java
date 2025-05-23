package com.mycompany.lab1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.awt.*;
import javax.swing.*;
public class RGB {
    static Color colour;
    static JPanel panel;
    static JFrame frame;
    public static void main(String[] args) {
        panel = new JPanel();
        JButton redbtn = new JButton("Red");
        redbtn.addActionListener(e->panel.setBackground(Color.RED));
        JButton bluebtn = new JButton("Blue");
        bluebtn.addActionListener(e->panel.setBackground(Color.BLUE));
        JButton greenbtn = new JButton("Green");
        greenbtn.addActionListener(e->panel.setBackground(Color.GREEN));
        panel.add(redbtn);
        panel.add(bluebtn);
        panel.add(greenbtn);
        frame = new JFrame();
        frame.add(panel);
        frame.setSize(250,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
