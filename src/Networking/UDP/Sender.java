package Networking.UDP;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;

public class Sender {

    public static void main(String[] args) throws UnsupportedEncodingException, 
                                                  SocketException,
                                                  UnknownHostException,
                                                  IOException {
        String message = "Hello over UDP protocol!";
        byte[] datagram = message.getBytes("UTF-8");
        DatagramPacket packet = new DatagramPacket(datagram, datagram.length);
        
        InetAddress address = InetAddress.getLocalHost();
        packet.setAddress(address);
        packet.setPort(8080);
        
        DatagramSocket socket = new DatagramSocket();
        socket.send(packet);
    }
}
