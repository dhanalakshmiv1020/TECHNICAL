

import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try {
            // create server socket
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("Server started... Waiting for client...");

            // accept connection
            Socket socket = serverSocket.accept();
            System.out.println("Connected to: " + socket.getInetAddress());

            // input & output streams
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));

            BufferedReader userInput = new BufferedReader(
                    new InputStreamReader(System.in));

            while (true) {
                // receive message
                String data = in.readLine();

                if (data.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected");
                    break;
                }

                System.out.println("Client: " + data);

                // send reply
                System.out.print("You: ");
                String msg = userInput.readLine();
                out.write(msg);
                out.newLine();   // important for readLine()
                out.flush();
            }

            // close connections
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}