package Lektion16;

import Lektion16.Ubung1.Brett;
import Lektion16.Ubung1.LaeuferImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaeuferImplTest {
    @Test
    public void testGibErlaubteFelder() {
        // Fil 4,4 pozisyonunda
        LaeuferImpl laeufer = new LaeuferImpl(4, 4);
        Brett brett = laeufer.gibErlaubteFelder();

        assertTrue(brett.gibFeld(5, 5));
        assertTrue(brett.gibFeld(6, 6));

        assertTrue(brett.gibFeld(1, 7));


        assertTrue(brett.gibFeld(7, 1));

        assertTrue(brett.gibFeld(1, 1));
    }

}