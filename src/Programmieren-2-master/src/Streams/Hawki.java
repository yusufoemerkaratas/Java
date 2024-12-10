package Streams;
import java.io.*;

import java.nio.Buffer;
import java.util.Scanner;

public class Hawki {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie dosya yolu");
        String filePath = scanner.nextLine();
        File sourcefile = new File(filePath);
        if (!sourcefile.exists() || !sourcefile.isFile()) {
            System.out.println("Gecersiz dosya girdniz");
        }
    }

    public static long unbufferedCopy(File source, File dest) throws IOException {
        try (FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(dest)) {
            long startTime = System.currentTimeMillis();
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            long endTime = System.currentTimeMillis();
            return endTime - startTime;
        }
    }

    public static long bufferedCopy(File source, File dest) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            long startTime = System.currentTimeMillis();
            int byteData;
            while ((byteData = bis.read()) != -1) {
                bos.write(byteData);
            }
            long endTime = System.currentTimeMillis();
            return startTime - endTime;
        }
    }
}
