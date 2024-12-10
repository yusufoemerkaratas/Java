
package Lektion18.Ubung2;
import java.io.*;
import java.net.*;

public class TCPserverandmain {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1235)) {
            System.out.println("Server is listening on port 1234...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println("Received: " + line);
                    out.println("OK");
                }

                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

















/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserverandmain {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(1453);
            System.out.println("Server verbindet auf port 1453...");
            while (true) {
                Socket clientSocket = null;
                BufferedReader bufferedReader = null;
                PrintWriter printWriter = null;

                try {
                    // İstemci bağlantısını kabul et
                    clientSocket = serverSocket.accept();
                    System.out.println("Verbindung erfolgreich mit einem Client!");

                    // Input ve Output akışlarını oluşturma
                    bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                    printWriter = new PrintWriter(clientSocket.getOutputStream(), true); // Otomatik flush özelliği açık

                    // İstemciden gelen her satırı okuma ve yanıt olarak "ok" gönderme
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println("Bekommt: " + line);
                        printWriter.println("ok"); // "ok" mesajını gönder
                        printWriter.flush();
                    }
                } catch (IOException e) {
                    System.out.println("Client verbindung Fehler: " + e.getMessage());
                } finally {
                    // Kaynakları kapatma (clientSocket, bufferedReader, printWriter)
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            System.out.println("Fehler beim Schließen des BufferedReaders: " + e.getMessage());
                        }
                    }
                    if (printWriter != null) {
                        printWriter.close(); // PrintWriter, IOException fırlatmaz
                    }
                    if (clientSocket != null) {
                        try {
                            clientSocket.close();
                        } catch (IOException e) {
                            System.out.println("Fehler beim Schließen des ClientSockets: " + e.getMessage());
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Server fehler: " + e.getMessage());
        } finally {
            // ServerSocket'i kapatma
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.out.println("Fehler beim Schließen des ServerSockets: " + e.getMessage());
                }
            }
        }
    }
}*/





//////Bu finallysiz hali
/*
package Lektion18.Ubung2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserverandmain {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(1453)) {
            System.out.println("Server verbindet auf port 1453");

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("Verbindung erfolgreich");

                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    OutputStream outputStream =  clientSocket.getOutputStream();

                    String line;
                    while ((line=bufferedReader.readLine()) != null) {
                        System.out.println("Bekommt: " + line);
                        byte[] responseBytes = "ok".getBytes();
                        outputStream.write(responseBytes);
                        outputStream.flush();
                    }
                } catch (IOException e) {
                    System.out.println("Client verbindung Fehler" + e.getMessage());

                    }
                }

        } catch (IOException e) {
            System.out.println("Server fehler" + e.getMessage());

        }
    }
}

*/
// TCP Server (Part a)


// TCP Client (Part b)
