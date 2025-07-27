package com.socket_example;

import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Echo Server started...");

        Socket clientSocket = serverSocket.accept();  // Waits for client
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String line;
        while ((line = in.readLine()) != null) {
            out.println(line);  // Echoes back the received line
            if (line.equals(".")) break; // Optionally stop on "."
        }

        clientSocket.close();
        serverSocket.close();
        System.out.println("Server closed.");
    }
}


