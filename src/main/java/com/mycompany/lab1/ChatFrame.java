/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author HP
 */
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;
public class ChatFrame implements ActionListener{
    JLabel label;
    JTextField msgbox;
    JButton send,reset;
    JTextArea txa;
    JMenuItem m11,m12,m13;
    JFrame frame;
    File file;

    public void createFrame(){

        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("View");
        JMenu m3 = new JMenu("Settings");
        JMenu m4 = new JMenu("Help");

        m11 = new JMenuItem("Open");
        m11.addActionListener(this);
        m12 = new JMenuItem("Save");
        m11.addActionListener(this);
        m13 = new JMenuItem("CLose");
        m11.addActionListener(this);

        JMenuBar mb = new JMenuBar();

        JMenuItem m21 = new JMenuItem("Standard");
        JMenuItem m22 = new JMenuItem("Custom");
        JMenuItem m31 = new JMenuItem("Connection");
        JMenuItem m32 = new JMenuItem("User");

        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m2.add(m21);
        m2.add(m22);
        m3.add(m31);
        m3.add(m32);
        m4.add(m4);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        
        label = new JLabel("This is label");
        msgbox = new JTextField(10);

        send = new JButton("send");
        send.addActionListener(this);
        reset = new JButton("reset");
        reset.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(msgbox);
        panel.add(send);
        panel.add(reset);
        // panel.add(txa);

        Border b = BorderFactory.createEmptyBorder(5,5,5,5);
        panel.setBorder(b);
        panel.setBorder(BorderFactory.createTitledBorder("chat"));

        txa = new JTextArea();
        txa.setLineWrap(true);
        txa.setEditable(false);

        Font f = new Font("Arial", Font.BOLD, 20);
        txa.setFont(f);
        txa.setForeground(Color.BLUE);

        // panel.setLayout(null);

        frame = new JFrame("Chat frame");
        frame.add(panel);

        frame.getContentPane().add(BorderLayout.NORTH,mb);
        frame.getContentPane().add(BorderLayout.CENTER,txa);
        frame.getContentPane().add(BorderLayout.SOUTH,panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("send")){
            txa.append("->"+msgbox.getText() + "\n");
            System.out.println("Sent");
            clear();
        }

        if(e.getActionCommand().equals("reset")){
            txa.setText("");
            System.out.println("Reset");
        }

        if(e.getSource().equals(m11)){
            JFileChooser f1 = new JFileChooser();
            f1.showOpenDialog(frame);
        }
        if(e.getSource().equals(m13)){
            System.exit(0);
        }

        if(e.getSource().equals(m12)){
            JFileChooser f2 = new JFileChooser();
            int op = f2.showSaveDialog(frame);
            if (op == JFileChooser.APPROVE_OPTION) {
                file = f2.getSelectedFile();
                try {
                    create();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }

    }
    public void clear(){
        msgbox.setText(null);
    }
    public void create() throws IOException{
        if (!file.exists()) {
            file.createNewFile();
        }
        else{
            JOptionPane.showMessageDialog(frame, "file exists");
        }
    }

    public static void main(String[] args) {
        ChatFrame fr = new ChatFrame();
        fr.createFrame();
    }
}
