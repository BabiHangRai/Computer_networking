package com.socket_example;

import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        try {
            // Connect to server on localhost and port 1234
            Socket socket = new Socket("localhost", 1234);

            // Streams for sending and receiving data
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );

            // Read from user input
            BufferedReader userInput = new BufferedReader(
                new InputStreamReader(System.in)
            );

            String input;
            System.out.println("Type messages. Type '.' to quit.");

            while ((input = userInput.readLine()) != null) {
                if (input.equals(".")) break;

                // Send to server
                out.println(input);

                // Read and display response from server
                String response = in.readLine();
                System.out.println("Echo: " + response);
            }

            // Close resources
            socket.close();
            userInput.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

