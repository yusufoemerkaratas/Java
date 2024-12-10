package Lektion18.Ubung2;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws  RuntimeException {
        try (Socket socket = new Socket("localhost", 1235)) {
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String userInput;
            String wort="Programmieren";
            int versuch=0;
            char[] array=new char[wort.length()];
            for(int i=0;i< array.length;i++){
                array[i]='_';
            }

            System.out.println("Enter text lines to send to the server (type 'exit' to quit):");
                do{
                    userInput = consoleReader.readLine();
                    char[] userarray=userInput.toCharArray();

                    char unser=userInput.charAt(0);
                     if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }else if (userInput.length()>1) throw new RuntimeException("Bitte geben Sie ein char");
                else  {
                   for(int i =0;i< userarray.length;i++){
                       if(userarray[i]==unser){
                           array[i]=unser;
                       }else{
                           versuch++;
                       }
                   }
                         System.out.println(new String (array));

                     }
                }while (userInput != null &&versuch<wort.length() );


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
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args){
        int serverPort=1453;
        String serverAdress="localHost";
        try(Socket socket =new Socket(serverAdress,serverPort);
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream())){

                System.out.println("Client Server'e baglandi. Metin girisi yapin ya da cikis yapmak icin exit yazin");
                String line;
                while((line= userInputReader.readLine())!=null){
                    if(line.equalsIgnoreCase("exit")) break;
                    out.println(line);
                    String serverResponse=in.readLine();
                    System.out.println("Serverden gelen yanit:"+ serverResponse);
                }
        }catch (IOException e ){
            System.out.println("Clientte bir hata olustu"+ e.getMessage());
        }
    }
}
*/