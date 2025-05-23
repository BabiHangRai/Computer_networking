/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author HP
 */
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowEventing extends WindowAdapter{
    JFrame frame;
    public void cx(){
        
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addWindowListener(this);
    
    }
    public static void main(String[] args) {
        WindowEventing re = new WindowEventing();
        re.cx();
    }

    @Override
    public void windowOpened(WindowEvent e)
    {
        JOptionPane.showMessageDialog(null, "Window Opened");
    }

    public void windowDeiconified(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Window Deiconified");
    }

    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Window Closing");
    }
    public void windowIconified(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "Window Iconified");
    }
}
