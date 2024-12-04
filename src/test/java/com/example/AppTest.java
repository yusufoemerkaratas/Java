package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    /**
     * Basit bir test metodu.
     */
    @Test
    public void testApp() {
        // Test başarılı olacak çünkü assertTrue her zaman doğru bir ifade test ediyor
        assertTrue(true, "Bu her zaman doğru olan bir testtir.");
    }
}
