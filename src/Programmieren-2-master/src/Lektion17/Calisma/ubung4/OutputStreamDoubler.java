package Lektion17.Calisma.ubung4;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

    public class OutputStreamDoubler extends OutputStream {
        private final OutputStream out1;
        private final OutputStream out2;

        // Constructor: İki OutputStream nesnesini alır ve onları saklar
        public OutputStreamDoubler(OutputStream out1, OutputStream out2) {
            this.out1 = out1;
            this.out2 = out2;
        }

        // Her iki OutputStream'e de byte yazar, hata durumunda diğerine yazmaya devam eder
        @Override
        public void write(int b) throws IOException {
            IOException ioException = null;

            try {
                out1.write(b);
            } catch (IOException e) {
                e.printStackTrace();
                ioException = e;
            }

            try {
                out2.write(b);
            } catch (IOException e) {
                e.printStackTrace();
                if (ioException != null) {
                    ioException.addSuppressed(e);
                } else {
                    ioException = e;
                }
            }

            if (ioException != null) {
                throw ioException;
            }
        }

        // Her iki OutputStream'i de kapatır, hata durumunda diğerine kapatma işlemi devam eder
        @Override
        public void close() throws IOException {
            IOException ioException = null;

            try {
                out1.close();
            } catch (IOException e) {
                ioException = e;
            }

            try {
                out2.close();
            } catch (IOException e) {
                if (ioException != null) {
                    ioException.addSuppressed(e);
                } else {
                    ioException = e;
                }
            }

            if (ioException != null) {
                throw ioException;
            }
        }

        // Main metodu
        public static void main(String[] args) {
            try (OutputStream fos1 = new FileOutputStream("file1.txt");
                 OutputStream fos2 = new FileOutputStream("file2.txt");
                 OutputStreamDoubler doubler = new OutputStreamDoubler(fos1, fos2)) {

                String data = "Hello, World!";
                for (char ch : data.toCharArray()) {
                    doubler.write(ch);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

