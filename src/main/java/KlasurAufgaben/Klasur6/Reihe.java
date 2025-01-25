package KlasurAufgaben.Klasur6;

import java.util.LinkedList;
import java.util.List;

public class Reihe {
    String name;
    List<Buch> reihe =new LinkedList<>();

        Reihe(String name,List<Buch> reihe){
            this.name=name;
            this.reihe=reihe;
        }


}
