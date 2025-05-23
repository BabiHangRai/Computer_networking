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

public class KeyAdapterExample extends JFrame {
    private JLabel label;

    public KeyAdapterExample() {
        setTitle("Sample shapes...");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Press any key on keyboard...");
        label.setForeground(Color.WHITE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(400, 200));
        panel.add(label);

        add(panel);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("Key Released: " + e.getKeyChar());
            }
        });

        setFocusable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyAdapterExample();
    }
}

