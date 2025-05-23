/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author HP
 */
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class keypressing implements KeyListener {
    String line1 = "";
    JTextArea textArea;
    JFrame frame;
    public void form(){
        textArea = new JTextArea(10,15);
        textArea.setText("Press a key");
        textArea.setEnabled(false);
        textArea.setBackground(Color.BLUE);
        frame = new JFrame("Key Listener");
        frame.add(textArea);
        frame.addKeyListener((KeyListener) this);
        frame.setVisible(true);
       
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
@Override
    public void keyTyped(KeyEvent e){
        line1 = "Key typed : " + e.getKeyChar();
        textArea.setText(line1);
    }
@Override
    public void keyPressed(KeyEvent e){
       
    }
@Override
    public void keyReleased(KeyEvent e){
        
    }

    public static void main(String[] args) {
        keypressing k = new keypressing();
        k.form();
    }
}

