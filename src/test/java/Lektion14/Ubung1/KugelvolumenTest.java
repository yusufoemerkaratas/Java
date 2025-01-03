package Lektion14.Ubung1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KugelvolumenTest {

    @Test
    void DoubleWertVerglecihTest(){
        double a =13.4;
        double b= 13.4;
        assertEquals(a,b);
    }
    @Test
    void berechneTest0() {

        double ergebnis = Kugelvolumen.berechneKugelvolumen(0);
        assertEquals(0,ergebnis);
    }
    @Test
    void berechneTest1(){
        double ergebnis = Kugelvolumen.berechneKugelvolumen(1);
        assertEquals(3.141592653589793,ergebnis);
    }
    @Test
    void berechneTestMinus1(){
        assertThrows(IllegalArgumentException.class,()-> {Kugelvolumen.berechneKugelvolumen(-1);});

        }
        @Test
    void berechneTest5(){
        double ergebnis = Kugelvolumen.berechneKugelvolumen(5);
        assertEquals(392.69908169872417,ergebnis);
    }

}