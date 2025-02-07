package KlasurAufgaben.Klasur4.a;

import java.util.Comparator;

public class VergleicheMusikStueckNachLaenge implements Comparator<MusikStueck> {
    public int compare(MusikStueck m1,MusikStueck m2){
        return Integer.compare(m1.laenge,m2.laenge);
    }

}
