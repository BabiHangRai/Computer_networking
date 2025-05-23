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
public class DrawShapes {
 public static void main(String args[])
 {
     JFrame frame=new JFrame("l1q2");
     frame.add(new Draw());
     frame.setSize(400,250);
     frame.setLocationRelativeTo(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
 }
}
