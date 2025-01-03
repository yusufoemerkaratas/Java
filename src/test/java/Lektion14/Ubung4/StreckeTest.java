package Lektion14.Ubung4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreckeTest {
    @Test
    void richtigspeichert(){
        Strecke neu = new Strecke(12,9);
        assertEquals(12,neu.b);
        assertEquals(9,neu.a);
    }
    @Test
    void überschneidTest() {
        Strecke erste = new Strecke(5, 8);
        Strecke zweite = new Strecke(7, 10);
        assertTrue(erste.überschneiden(zweite));
    }
    @Test
    void testToString() {
        Strecke s1 = new Strecke(3, 5);
        Strecke s2 = new Strecke(2, 8);
        Strecke s3 = new Strecke(4, 4);

        assertEquals("3--5", s1.toString());
        assertEquals("2------8", s2.toString());
        assertEquals("4", s3.toString());
    }


}