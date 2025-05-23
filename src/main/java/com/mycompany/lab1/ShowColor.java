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
import java.awt.event.*;
import javax.swing.*;
public class ShowColor implements ActionListener{
    JButton btn;
    Color color;
    JPanel panel;
    JFrame frame;
    public void showColor(){
        panel=new JPanel();
        panel.setBackground(color);
        
        btn=new JButton("Change color");
        btn.addActionListener(this);
        
        panel.add(btn);
        frame=new JFrame("Sample frame..");
        frame.getContentPane().add(panel);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        color=JColorChooser.showDialog(frame,"Choose a color", color);
        if(color==null)
            color=Color.lightGray;
        panel.setBackground(color);
    }
    public static void main(String args[]){
            ShowColor show=new ShowColor();
    show.showColor();
    }

}
