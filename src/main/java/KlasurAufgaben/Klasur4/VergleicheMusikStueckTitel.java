package KlasurAufgaben.Klasur4;

import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {

    public int compare(MusikStueck erste,MusikStueck zweite){
        if(erste.titel.compareTo(zweite.titel)<0) return -1;
        else if (erste.titel.compareTo(zweite.titel)>0) return  1;
        else return  0;
    }

}
