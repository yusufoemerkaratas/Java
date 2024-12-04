package Lektiion20.Ubung4;

import java.util.HashMap;
import java.util.Map;

public class Keypad {

    private static final Map<Character, Integer> keypad = new HashMap<>();

    static {
        // Telefon tuş takımındaki harf-sayı eşleşmeleri
        keypad.put('A', 2); keypad.put('B', 2); keypad.put('C', 2);
        keypad.put('D', 3); keypad.put('E', 3); keypad.put('F', 3);
        keypad.put('G', 4); keypad.put('H', 4); keypad.put('I', 4);
        keypad.put('J', 5); keypad.put('K', 5); keypad.put('L', 5);
        keypad.put('M', 6); keypad.put('N', 6); keypad.put('O', 6);
        keypad.put('P', 7); keypad.put('Q', 7); keypad.put('R', 7); keypad.put('S', 7);
        keypad.put('T', 8); keypad.put('U', 8); keypad.put('V', 8);
        keypad.put('W', 9); keypad.put('X', 9); keypad.put('Y', 9); keypad.put('Z', 9);
    }

    // Bir harfin karşılık gelen sayıyı bulur
    public static int getNumber(char c) throws IllegalnummmerException {
        c = Character.toUpperCase(c); // Küçük harfleri büyüğe çevir
        if (!keypad.containsKey(c)) { // Harf Map'te yoksa hata fırlat
            throw new IllegalnummmerException("Geçersiz karakter: " + c);
        }
        return keypad.get(c); // Harfin karşılık geldiği sayıyı döndür
    }
}
