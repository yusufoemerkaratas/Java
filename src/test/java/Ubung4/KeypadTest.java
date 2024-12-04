package Ubung4;

import Lektiion20.Ubung4.IllegalnummmerException;
import Lektiion20.Ubung4.Keypad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeypadTest {

    @Test
        public void testValidCharacter() throws IllegalnummmerException {
            assertEquals(2, Keypad.getNumber('A'), "A harfi 2'ye eşlenmeli");
            assertEquals(3, Keypad.getNumber('F'), "F harfi 3'e eşlenmeli");
        }

        @Test
        public void testInvalidCharacterThrowsException() {
            assertThrows(IllegalnummmerException.class, () -> {
                Keypad.getNumber('1'); // Geçersiz bir karakter
            }, "Geçersiz karakter için IllegalTelephoneNumberException atılmalı");
        }
    }
