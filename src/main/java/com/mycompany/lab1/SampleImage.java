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
public class SampleImage {
    public static void main(String args[])
    {
        ImageIcon icon =new ImageIcon("C://Users//HP//Pictures/download.jpg");
        JLabel label=new JLabel(icon);
        JFrame f=new JFrame("Add an image to JFrame");
        f.add(label);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
