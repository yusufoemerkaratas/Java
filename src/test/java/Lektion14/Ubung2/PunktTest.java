package Lektion14.Ubung2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PunktTest {
    @Test
    void verschiebePunktTest(){
        Punkt p = new Punkt();
        assertThrows(RuntimeException.class,()->{p.verschiebePunkt(1990,1200); });
    }
    @Test
    void testGültigeKoordinaten() {
        Punkt p = new Punkt();
        p.verschiebePunkt(1000, 500);
        assertEquals(1000, p.x);
        assertEquals(500, p.y);
    }
}