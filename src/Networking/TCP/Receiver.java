package ru.avalon.java;

import java.io.*;
import java.net.*;

public class Receiver {

    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(8080)) {
            try (Socket socket = server.accept()) {
                InputStream stream = socket.getInputStream();
                Reader reader = new InputStreamReader(stream);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line = bufferedReader.readLine();
                System.out.println(line);
            }
        }
    } 
}
