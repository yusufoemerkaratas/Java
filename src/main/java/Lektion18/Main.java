package Lektion18;

import javax.imageio.IIOException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Ubung neu= new Ubung();
        try{
            neu.splitStudiengaenge("quelle");
        }catch (MatrikelNummerException e){
            System.out.println("Bir hata olustu");
        }
    }
}
