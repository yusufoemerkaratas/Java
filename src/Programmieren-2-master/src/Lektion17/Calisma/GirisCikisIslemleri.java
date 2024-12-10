package Lektion17.Calisma;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GirisCikisIslemleri {
    public static void main(String[] args){
        FileOutputStream fileOutputStream =null;
        try {
            fileOutputStream = new FileOutputStream("dosya.txt");
            String isim = "Yusuf Ömer Karatas";
            byte[] isimdizi =isim.getBytes();;
            fileOutputStream.write(isimdizi);

        } catch(FileNotFoundException ex){
            System.out.println("Dosya bulunamadi");
            } catch (IOException e) {
            System.out.println("Hata olustu yazarken");
        } finally {
            try {
                if(fileOutputStream !=null){
                    fileOutputStream.close();

                }
            } catch (IOException e) {
                System.out.println("Hata cikti");
            }
        }

    }
}
