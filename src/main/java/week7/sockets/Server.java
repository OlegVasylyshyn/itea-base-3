package week7.sockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class Server {

    private ServerSocket serverSocket;
    private Socket clientSocket;

    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Waiting for new connections");
        clientSocket = serverSocket.accept();
        System.out.println("Was accepted new client");

        InputStream inputStream = clientSocket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        while (true){
            String message = reader.readLine();
            if(message == null) break;
            System.out.println("Message from client - " + message);

            System.out.print("Enter you message - ");
            byte[] buff = new byte[1024];
            int read = System.in.read(buff, 0, buff.length);
            clientSocket.getOutputStream().write(buff, 0, read);
        }

    }

    public static void main(String[] args) throws IOException {
        new Server(8081);
    }

}
