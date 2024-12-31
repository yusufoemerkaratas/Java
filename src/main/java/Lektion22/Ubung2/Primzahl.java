package Lektion22.Ubung2;
import java.util.*;

public class Primzahl extends Thread{
     private List<Integer> liste;
    private Map<Integer,Boolean> result=new HashMap<>();

    public Primzahl(List<Integer> liste) {
        this.liste = liste;
    }

    private boolean isPrimzahl(int zahl){
        if(zahl<2) return false;
        for(int i=2;i<Math.sqrt(zahl);i++){
            if(zahl%i==0) {
                return  false;
            }
        }
        return true;
    }

    public void run(){
        for(int zahl : liste){
            boolean ist = isPrimzahl(zahl);
            result.put(zahl,ist);
        }
    }
    public  Map<Integer,Boolean> getResult(){
        return  result;
    }
}
