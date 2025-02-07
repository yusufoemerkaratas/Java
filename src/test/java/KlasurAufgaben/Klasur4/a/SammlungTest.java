package KlasurAufgaben.Klasur4.a;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SammlungTest {
    @Test
    void myTest(){
        MusikStueck m1=new MusikStueck("cok yasliyim","kayra",123);
        MusikStueck m2=new MusikStueck("nedense","sago",160);
        MusikStueck m3=new MusikStueck("ah gönlum","bilmiyom",180);
        List<MusikStueck> exceptedTitel=Arrays.asList(m3,m1,m2);
        List<MusikStueck> exceptedLaenge=Arrays.asList(m1,m2,m3);
        Sammlung mysammlung=new Sammlung();
        mysammlung.einfuegen(m1);
        mysammlung.einfuegen(m2);
        mysammlung.einfuegen(m3);
        List<MusikStueck> sortedNachTitel=mysammlung.getAlleMusikStueckNachTitel();
        List<MusikStueck> sortedNachLaenge=mysammlung.getAlleMusikStueckNachLaenge();
        assertEquals(exceptedTitel,sortedNachTitel);
        assertEquals(exceptedLaenge,sortedNachLaenge);


    }

}