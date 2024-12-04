package Lektiion20.Ubung4;
import java.io.*;

public class ReaderandWriter {

        public static void processFiles(String inputFile, String outputFile) {
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

                String line;
                // Girdi dosyasındaki her satırı işle
                while ((line = reader.readLine()) != null) {
                    try {
                        String numberString = Converter.convertTextToNumbers(line); // Harfleri sayılara çevir
                        writer.write(numberString); // Çevrilen sayıları yaz
                        writer.newLine(); // Yeni satır
                    } catch (IllegalnummmerException e) {
                        System.err.println("Hata: " + e.getMessage());
                        // Hatalı satırı atla ve devam et
                    }
                }

            } catch (IOException e) {
                System.err.println("Dosya işleme hatası: " + e.getMessage());
            }
        }
}
