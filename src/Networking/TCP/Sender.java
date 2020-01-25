package Networking.TCP;

import java.net.*;
import java.io.*;

public class Sender {

    public static void main(String[] args) throws UnknownHostException, 
                                                  IOException {
        String message = "Hello over TCP protocol";
        InetAddress address = InetAddress.getLocalHost();
        try (Socket socket = new Socket(address, 8080)) {
            OutputStream stream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(stream);
            writer.write(message);
            writer.flush();
        }        
    }
}
