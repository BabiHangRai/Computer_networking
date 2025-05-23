/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author HP
 */
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class DrawImage extends JPanel {
@Override
public void paint(Graphics g){
    ImageIcon icon=new ImageIcon("C:\\Users\\HP\\Pictures\\sunflower.jpg");
    Image img=icon.getImage();
    g.drawImage(img,0,0,this);
    g.drawImage(img,250,250,this);
    g.drawImage(img,0,250,150,100,this);
}
public static void main(String[] args){
JFrame f=new JFrame("l1q4");
f.add(new DrawImage());
f.setSize(700,700);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}