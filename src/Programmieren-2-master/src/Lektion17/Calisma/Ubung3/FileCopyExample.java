package Lektion17.Calisma.Ubung3;
 import java.io.*;
import java.util.Scanner;

    public class FileCopyExample {

        public static void main(String[] args) {
            try {
                // Kullanıcının dosya yolu girişi
                Scanner scanner = new Scanner(System.in);
                System.out.print("Lütfen kopyalanacak müzik dosyasının yolunu girin: ");
                String sourceFilePath = scanner.nextLine();
                File sourceFile = new File(sourceFilePath);

                // Dosyanın varlığını kontrol etme
                if (!sourceFile.exists() || !sourceFile.isFile()) {
                    System.out.println("Geçersiz dosya yolu veya dosya mevcut değil.");
                    return;
                }

                // Çıktı dosyaları
                File copyUnbuffered = new File("copy_unbuffered.mp3");
                File copyBuffered = new File("copy_buffered.mp3");
                File copyArray = new File("copy_array.mp3");

                // Zaman ölçüm ve sonuç yazdırma
                long timeUnbuffered = unbufferedCopy(sourceFile, copyUnbuffered);
                long timeBuffered = bufferedCopy(sourceFile, copyBuffered);
                long timeArrayBuffered = arrayBufferedCopy(sourceFile, copyArray, 1024);

                System.out.println("Unbuffered Byte by Byte: " + timeUnbuffered + " ms");
                System.out.println("Buffered Byte by Byte: " + timeBuffered + " ms");
                System.out.println("Array Buffered: " + timeArrayBuffered + " ms");

                // Dosya uzunluğu kontrolü
                verifyFiles(sourceFile, copyUnbuffered, copyBuffered, copyArray);

            } catch (IOException e) {
                System.err.println("Bir hata oluştu: " + e.getMessage());
            }
        }

        // Unbuffered Byte by Byte kopyalama
        public static long unbufferedCopy(File source, File dest) throws IOException {
            try (FileInputStream fis = new FileInputStream(source);
                 FileOutputStream fos = new FileOutputStream(dest)) {

                long startTime = System.currentTimeMillis();
                int byteData;
                while ((byteData = fis.read()) != -1) {
                    fos.write(byteData);
                }
                long endTime = System.currentTimeMillis();
                return endTime - startTime;
            }
        }

        // Buffered Byte by Byte kopyalama
        public static long bufferedCopy(File source, File dest) throws IOException {
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

                long startTime = System.currentTimeMillis();
                int byteData;
                while ((byteData = bis.read()) != -1) {
                    bos.write(byteData);
                }
                long endTime = System.currentTimeMillis();
                return endTime - startTime;
            }
        }

        // Unbuffered Byte Array ile kopyalama
        public static long arrayBufferedCopy(File source, File dest, int bufferSize) throws IOException {
            try (FileInputStream fis = new FileInputStream(source);
                 FileOutputStream fos = new FileOutputStream(dest)) {

                byte[] buffer = new byte[bufferSize];
                long startTime = System.currentTimeMillis();
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
                long endTime = System.currentTimeMillis();
                return endTime - startTime;
            }
        }

        // Dosya karşılaştırması
        private static void verifyFiles(File original, File... copies) {
            boolean allMatch = true;
            long originalLength = original.length();

            for (File copy : copies) {
                if (originalLength != copy.length()) {
                    System.out.println(copy.getName() + " dosya boyutu eşleşmiyor.");
                    allMatch = false;
                }
            }

            if (allMatch) {
                System.out.println("Tüm dosyalar başarıyla kopyalandı ve eşleşiyor.");
            }
        }
    }
