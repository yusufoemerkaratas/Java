package Lektion17.Ubung3;
import java.io.*;
import java.util.Scanner;

public class FileKopieren {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        File file;

        while(true) {
            try {
                System.out.println("Bitte geben Sie filepath");
                String filepath = scanner.nextLine();
                file = new File(filepath);

                if (!file.isFile() || !file.exists()) {
                    throw new FileNotFoundException("Bitte geben Sie ein gültige path");
                }
                break;
            } catch (FileNotFoundException e) {
            }
        }
            File copyUnbuffered= new File("copyUnbuffered.mp3");
            File copybuffered= new File("copybuffered.mp3");
            File copyUnbufferedbyte= new File("copyUnbufferedbyte.mp3");


        try{
            long timeUnbuffered = unbuffered(file ,copyUnbuffered);
            long timeUnbufferedByte = ungebuffertByteweise(file,copyUnbufferedbyte);
            long timeBuffered= buffered(file,copybuffered);

            System.out.println("Unbuffered Byte by Byte: " + timeUnbuffered + " ms");
            System.out.println("Buffered Byte by Byte: " + timeBuffered + " ms");
            System.out.println("Array Buffered (1024 byte): " + timeUnbufferedByte + " ms");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }







    public static long ungebuffertByteweise(File file,File ziel)throws IOException {
        try(FileInputStream fileInputStream=new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(ziel)){
            long startTime =System.currentTimeMillis();
            byte[] buffer=new byte[1024];
            int gelesen;
            while((gelesen= fileInputStream.read(buffer))!=-1){
                fileOutputStream.write(buffer,0,gelesen);
            }
            long finishTime=System.currentTimeMillis();
            return finishTime-startTime;
        }
    }
    public static long unbuffered(File file,File ziel) throws IOException{
        try(FileInputStream fis =new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(ziel)){
            long startTime= System.currentTimeMillis();
            int gelesen;
            while((gelesen=fis.read())!=-1){
                fos.write(gelesen);
            }
            long finishTime=System.currentTimeMillis();
            return finishTime-startTime;
        }
    }
    public static long buffered(File file,File ziel)throws IOException{
        try(BufferedInputStream bis= new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream(ziel))){
            long startTime=System.currentTimeMillis();
            int gelesen;
            while((gelesen=bis.read())!=-1){
                bos.write(gelesen);
            }
            long finishTime=System.currentTimeMillis();
            return finishTime-startTime;
        }

    }
}
