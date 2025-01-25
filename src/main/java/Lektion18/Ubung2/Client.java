package Lektion18.Ubung2;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 1453)) {
            System.out.println("Client verbunden");

            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {

                // Sunucuya mesaj gönder
                bufferedWriter.write("Test Message\n"); // Mesajı gönder (satır sonu ekliyoruz)
                bufferedWriter.flush(); // Tamponu boşaltarak mesajı hemen gönderiyoruz

                // Sunucudan gelen yanıtı oku
                String response = bufferedReader.readLine();
                System.out.println("Server: " + response);
            }
        }
    }
}
