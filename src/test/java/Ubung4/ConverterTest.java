package Ubung4;

import Lektiion20.Ubung4.Converter;
import Lektiion20.Ubung4.IllegalnummmerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ConverterTest {

    @Test
    public void testValidInput() throws IllegalnummmerException {
        assertEquals("43556", Converter.convertTextToNumbers("HELLO"));
        assertEquals("96753", Converter.convertTextToNumbers("WORLD"));
    }

    @Test
    public void testCaseInsensitive() throws IllegalnummmerException {
        assertEquals("43556", Converter.convertTextToNumbers("hello"));
        assertEquals("43556", Converter.convertTextToNumbers("HELLO"));
    }

    @Test
    public void testInvalidInputThrowsException() {
        assertThrows(IllegalnummmerException.class, () -> {
            Converter.convertTextToNumbers("HELLO!"); // Geçersiz karakter
        });
    }

    @Test
    public void testEmptyInput() throws IllegalnummmerException {
        assertEquals("", Converter.convertTextToNumbers(""));
    }
}
