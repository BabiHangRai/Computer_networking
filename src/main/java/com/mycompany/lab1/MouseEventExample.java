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
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class MouseEventExample implements MouseListener{
    JFrame frame;
    public MouseEventExample()
    {
        frame=new JFrame("Click your mouse.");
        frame.addMouseListener(this);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        JOptionPane.showMessageDialog(null,"Mouse clicked..");
    }
    public void mousePressed(MouseEvent e){
        Graphics g=frame.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    public void mouseReleased(MouseEvent e)
    {
        JOptionPane.showMessageDialog(null,"Mouse released...");
    }
    public static void main(String args[]){
        MouseEventExample me=new MouseEventExample();
    }
    public void mouseEntered(MouseEvent e){
    }
    public void mouseExited(MouseEvent e){
  
    }
}
