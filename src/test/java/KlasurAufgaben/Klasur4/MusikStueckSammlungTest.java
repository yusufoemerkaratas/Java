package KlasurAufgaben.Klasur4;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MusikStueckSammlungTest {
    @Test
    void testSortierungnachTitel(){
        MusikStueck m1 = new MusikStueck("cok yasliyim","kayra",178);
        MusikStueck m2 = new MusikStueck("ayaz meyhanesi","kayra",150);
        MusikStueck m3 = new MusikStueck("mertel kasetcilik","kayra",190);
        MusikStueck m4 = new MusikStueck("Dobra vecer","kayra",700);
        MusikStueckSammlung sammlung= new MusikStueckSammlung();
        sammlung.musikStueckEinfuegen(m1);
        sammlung.musikStueckEinfuegen(m2);
        sammlung.musikStueckEinfuegen(m3);
        sammlung.musikStueckEinfuegen(m4);

        List<MusikStueck> result=sammlung.getAlleMusikStueckeNachTitel();
        List<MusikStueck> erwartet=new ArrayList<>();
        erwartet.add(m1);
        erwartet.add(m2);
        erwartet.add(m3);
        erwartet.add(m4);
        erwartet.sort(Comparator.comparing(m->m.titel));
        assertEquals(result,erwartet);
    }

}