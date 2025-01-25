package KlasurAufgaben.Klasur4;

import java.util.Comparator;

public class VergleicheMusikStueckLaenge implements Comparator<MusikStueck>{
    public int compare(MusikStueck erste,MusikStueck zweite){
        if(erste.laenge> zweite.laenge) return 1;
        else if (erste.laenge< zweite.laenge) return -1;
        else return 0;
    }
}
