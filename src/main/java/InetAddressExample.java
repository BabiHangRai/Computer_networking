/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
public class InetAddressExample{

    public static int getVersion(InetAddress ia){
        byte[] address = ia.getAddress();
        if(address.length == 4 ){
                return 4;
        } else if (address.length == 16) {
            return 6;
        }else {
            return -1;
        }
    }
    public static void main(String args[]){
        try{
            //get localhost details
            InetAddress localhost = InetAddress.getLocalHost();
            //print both system name and ip address
            System.out.println(localhost);
            //print system name
            System.out.println(localhost.getHostName());
            //print system address: ip address
            System.out.println(localhost.getHostAddress());
            //get cononical hostname
            System.out.println(localhost.getCanonicalHostName().toString());
            
            
            //get address by using hostname
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println(address);
             //print system name
            System.out.println(address.getHostName());
            //print system address: ip address
            System.out.println(address.getHostAddress());
            //print system address: ip address
            byte[] add = address.getAddress();
            System.out.println(Arrays.toString(add));
            System.out.println(address.getCanonicalHostName().toString());
            //check ip address version
            int version = InetAddressExample.getVersion(InetAddress.getByName("1050:0000:0000:0000:0005:0600:300c:326b"));
            System.out.println("Supplied address is IPv" + version );

            InetAddress address1
            = InetAddress.getByName("172.19.25.29");
            System.out.println(
                "InetAddresses of Named Host : "
                + address1);

            InetAddress address3[]
            = InetAddress.getAllByName("172.19.25.29");
            for (int i = 0; i < address3.length; i++) {
                System.out.println(
                    "ALL InetAddresses of Named Host : "
                    + address3[i]);
            }
        }catch(UnknownHostException uhe){
            System.out.println(uhe.getMessage());
        }
    }
}

        
    
   
