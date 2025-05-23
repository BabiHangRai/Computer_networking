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
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
public class FontExample extends JPanel{
    @Override
    public void paint(Graphics g){
        g.setFont(new Font("Arial",Font.BOLD,12));
        g.drawString("this is sample text",20,30);
        
        g.setFont(new Font("Serif",Font.ITALIC,18));
        g.drawString("this is another sample text", 20, 60);
        
        g.setColor(Color.red);
        g.setFont(new Font("Monospaced",Font.BOLD,20));
        g.drawString("This is again another sample text", 20, 20);
        
        g.setFont(new Font("Gothic",Font.ITALIC,20));
        g.drawString("Text", 20, 50);
    }
}
