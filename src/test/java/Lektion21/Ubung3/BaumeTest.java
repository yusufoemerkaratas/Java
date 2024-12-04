package Lektion21.Ubung3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaumeTest {
    @Test
    void testEinfuegen(){
        Baume<Integer> baum = new Baume<>();
        baum.einfuegen(6);
        baum.einfuegen(3);
        baum.einfuegen(2);
        baum.einfuegen(66);
        baum.einfuegen(1);
        baum.einfuegen(0);

        assertEquals(6,baum.getRootValue(),"Root knoten soll '6' sein");


    }

}