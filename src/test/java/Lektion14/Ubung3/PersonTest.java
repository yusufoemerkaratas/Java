package Lektion14.Ubung3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void PersonTest(){
            Adresse adresse = new Adresse("Hauptstrasse", "Wü", "97070", "12");
            Person person = new Person("Markus", "Schmidt", adresse);
            assertEquals("Markus", person.getVorname());
            assertEquals("Hauptstrasse", person.getAdresse().getStrasse());
        }
        @Test
        void testVornameMitKleinbuchstaben() {
            Adresse adresse = new Adresse("Hauptstrasse", "12", "97070", "Würzburg");
            assertThrows(RuntimeException.class, () -> {
                new Person("markus", "Schmidt", adresse);
            });
        }
        @Test
         void testStrasseMitKleinbuchstaben() {
            Adresse adresse = new Adresse("nebenstrasse", "12", "97070", "Würzburg");
             assertThrows(RuntimeException.class, () -> {
             new Person("Markus", "Schmidt", adresse);
        });
    }
}