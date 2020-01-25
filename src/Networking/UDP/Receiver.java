package Networking.UDP;

import java.net.*;
import java.io.*;

public class Receiver {

    public static void main(String[] args) throws SocketException, 
                                                  IOException {
        final int MAX_MESSAGE_SIZE = 1024;
        byte[] buffer = new byte[MAX_MESSAGE_SIZE];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        
        DatagramSocket socket = new DatagramSocket(8080);
        socket.receive(packet);
        
        String message = new String(buffer, "UTF-8");
        System.out.println(message);
    }
}
