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
import java.awt.Graphics;
import javax.swing.JPanel;
public class Draw extends JPanel{
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.drawLine(3, 30, 300, 30);
        
        g.setColor(Color.BLUE);
        g.drawRect(5,40,90,55);
        g.fillRect(100,40,90,55);
        
        g.setColor(Color.GREEN);
        g.drawOval(195, 40, 90, 55);
        g.fillOval(290, 40, 90, 55);
        
        g.setColor(Color.CYAN);
        g.fillOval(5,100,90,90);
    }
    
}
