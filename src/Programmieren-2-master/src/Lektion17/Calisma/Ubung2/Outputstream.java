package Lektion17.Calisma.Ubung2;

import java.io.IOException;

public class Outputstream {
    public void write(byte[] b , int off,int len) throws IOException{
        if(b==null) throw new NullPointerException("B kann nicht null sein");
        if(off+len>b.length|| off<0 || len <0) throw new IndexOutOfBoundsException("off oder len ist nicht gültig");
        
    }
}
