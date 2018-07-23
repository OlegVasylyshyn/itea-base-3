package week7.sockets;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class Client {

    private Socket socket;

    public Client(int port, String host) throws IOException, InterruptedException {
        socket = new Socket(host, port);
        System.out.println("Connected");

        InputStream inputStream = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        while (true){
            System.out.print("Enter you message - ");

            byte[] buff = new byte[1024];
            int read = System.in.read(buff, 0, buff.length);
            socket.getOutputStream().write(buff, 0, read);


            String message = reader.readLine();
            if(message == null) break;
            System.out.println("Message from server - " + message);
        }

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new Client(8081, "127.0.0.2");
    }

}
