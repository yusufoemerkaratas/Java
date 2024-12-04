package Lektiion20.Ubung4;

public class Converter {
    public static String convertTextToNumbers(String text) throws IllegalnummmerException {
        String numberString = ""; // Boş bir String başlat

        for (char c : text.toCharArray()) { // Her harfi işle
            numberString += Keypad.getNumber(c); // Harfi sayıya çevir ve String'e ekle
        }

        return numberString; // Sonuç dizisini döndür
    }
}
