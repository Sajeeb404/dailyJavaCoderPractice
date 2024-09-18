package com.mycompany.test;

import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("my name is sajeeb");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

