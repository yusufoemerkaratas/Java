package Lektiion20.Ubung4;

public class Main {

        public static void main(String[] args) {
            String inputFile = "Zeichenkontakte.txt"; // Girdi dosyası
            String outputFile = "Nummerkontakte.txt"; // Çıktı dosyası

            ReaderandWriter.processFiles(inputFile, outputFile); // Dosyaları işle
            System.out.println("Dosyalar başarıyla işlendi!"); // Başarı mesajı
        }


}
