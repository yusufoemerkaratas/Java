package KlasurAufgaben.Klasur6;

import java.util.*;
import java.util.Comparator;

public class Buchsortier{
    public void sortier(List<? extends Buch> buecher){
        buecher.sort((b1,b2) -> {
            int wert=b1.autor.compareTo(b2.autor);
            if(wert==0) return b1.name.compareTo(b2.name);
            else return wert;
        });
    }

}
