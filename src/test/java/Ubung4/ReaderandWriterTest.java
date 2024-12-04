package Ubung4;

import Lektiion20.Ubung4.ReaderandWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class ReaderandWriterTest {
    private File inputFile;
    private File outputFile;

    @BeforeEach
    void setUp() throws IOException {
        // Geçici giriş ve çıkış dosyaları oluştur
        inputFile = File.createTempFile("input", ".txt");
        outputFile = File.createTempFile("output", ".txt");

        // Giriş dosyasını hazırlamak için yazıcı kullan
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("HELLO"); // Geçerli veri
            writer.newLine();
            writer.write("WORLD"); // Geçerli veri
            writer.newLine();
            writer.write("INVALID!"); // Geçersiz veri
        }
    }

    @AfterEach
    void tearDown() {
        // Testlerden sonra geçici dosyaları sil
        if (inputFile.exists()) {
            inputFile.delete();
        }
        if (outputFile.exists()) {
            outputFile.delete();
        }
    }

    @Test
    void testProcessFiles() throws IOException {
        // Sınıfı test et
        ReaderandWriter.processFiles(inputFile.getAbsolutePath(), outputFile.getAbsolutePath());

        // Çıktı dosyasını oku ve kontrol et
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFile))) {
            assertEquals("43556", reader.readLine(), "HELLO -> 43556 olmalı");
            assertEquals("96753", reader.readLine(), "WORLD -> 96753 olmalı");
            assertNull(reader.readLine(), "Geçersiz veri atlanmalı");
        }
    }

    @Test
    void testIOExceptionHandling() {
        // Geçersiz bir giriş dosyası ver ve hata bekle
        assertDoesNotThrow(() -> ReaderandWriter.processFiles("nonexistent.txt", outputFile.getAbsolutePath()),
                "Hatalı giriş dosyası düzgün bir şekilde işlenmeli");
    }

}