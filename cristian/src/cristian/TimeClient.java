/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cristian;

/**
 *
 * @author user
 */
import java.net.*;
import java.io.*;

public class TimeClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            long serverTime = Long.parseLong(in.readLine());
            long clientTime = System.currentTimeMillis();

            long timeDifference = serverTime - clientTime;
            System.out.println("Server time: " + serverTime);
            System.out.println("Client time: " + clientTime);
            System.out.println("Time difference: " + timeDifference);

            socket.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
