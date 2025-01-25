package Lektion18.Ubung4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPOutputStream;

public class Client {
    public static void main(String args[]) throws IOException {
        byte[] bytesToTransfer="HalloWelt\n".getBytes();
        Socket connnectionHost=new Socket("localhost",1453);
        OutputStream os =connnectionHost.getOutputStream();

        try(GZIPOutputStream gzipOutputStream = new GZIPOutputStream(os)){
            gzipOutputStream.write(bytesToTransfer);
            gzipOutputStream.flush();
        }
        connnectionHost.close();

    }
}
