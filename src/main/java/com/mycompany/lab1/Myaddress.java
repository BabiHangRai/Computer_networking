/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author HP
 */
import java.net.*;
public class Myaddress {
    public static void main(String[] args)
    {
        try{
            InetAddress me=InetAddress.getLocalHost();
            String dottedQuad =me.getHostAddress();
            System.out.println("My address is "+dottedQuad);
        }catch(UnknownHostException ex){
            System.out.println("i'm sorry dunno the address");
        }
    }
}
