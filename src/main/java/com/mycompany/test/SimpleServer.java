package com.mycompany.test;

import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server is listening on port 8080");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                String message = reader.readLine();
                System.out.println("Received: " + message);
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
