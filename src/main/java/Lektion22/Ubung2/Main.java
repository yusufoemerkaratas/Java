package Lektion22.Ubung2;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Sayı listeleri (Her thread farklı bir grup üzerinde çalışacak)
        java.util.List<Integer> list1 = Arrays.asList(10, 23, 56, 101, 341);
        List<Integer> list2 = Arrays.asList(29, 48, 87, 133, 633910099);
        List<Integer> list3 = Arrays.asList(2, 3, 5, 7, 11, 13);

        // Thread oluşturma
        PrimzahlThread thread1 = new PrimzahlThread(list1);
        PrimzahlThread thread2 = new PrimzahlThread(list2);
        PrimzahlThread thread3 = new PrimzahlThread(list3);

        // Thread'leri başlat
        thread1.start();
        thread2.start();
        thread3.start();

        // Ana thread, diğer thread'lerin bitmesini bekliyor
        thread1.join();
        thread2.join();
        thread3.join();

        // Sonuçları birleştir
        Map<Integer, Boolean> finalResult = new HashMap<>();
        finalResult.putAll(thread1.getResult());
        finalResult.putAll(thread2.getResult());
        finalResult.putAll(thread3.getResult());

        // Sonuçları ekrana yazdır
        for (Map.Entry<Integer, Boolean> entry : finalResult.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static class List<T> {
    }
}
