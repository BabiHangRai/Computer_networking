/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.net.*;
public class NewClass {
    public static void main(String[] args) throws UnknownHostException
    {
        
            InetAddress address= InetAddress.getByName("104.21.79.8");
            System.out.println(address.getCanonicalHostName());
       
    }
}
