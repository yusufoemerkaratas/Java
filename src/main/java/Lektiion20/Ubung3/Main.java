package Lektiion20.Ubung3;

public class Main {
    public static void main(String[] args) {
        MultiMap dictionary = new MultiMap();

        // PUT ile Almanca anlamlar ekle
        dictionary.put("to clean", "reinigen");
        dictionary.put("to clean", "säubern");
        dictionary.put("to clean", "putzen");

        dictionary.put("to expand", "vergrößern");
        dictionary.put("to expand", "wachsen");

        // GET ile anlamları al
        System.out.println("to clean -> " + dictionary.get("to clean"));
        System.out.println("to expand -> " + dictionary.get("to expand"));
        System.out.println("to play -> " + dictionary.get("to play")); // Bu anahtar yok
    }
}
