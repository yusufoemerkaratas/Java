package Streams;

import java.io.*;

public class writerreader {
    public static void main(String[] args) {
        /////FileWriter
        /*try(FileWriter writer = new FileWriter("deneme.txt",true)){
            writer.write("\nMerhaba Dünya! ");
        } catch (IOException e){
            System.out.println("Ein Fehler ist aufgetrogffen");
        }*/
        ////////////////////////FileReader
       /* try(FileReader reader = new FileReader("deneme.txt")){
            int cha;
            while((cha=reader.read()) !=-1 ){
                System.out.print((char) cha);
            }
        }catch(IOException e){
            System.out.println("fehler");
        }
    */
        //////////BufferedWriter
      /*  try(BufferedWriter bufferedWriter=new BufferedWriter (new FileWriter("bufdenemesi"))){
            bufferedWriter.write("Söylenen Göre bunlar daha hizliymis");
            bufferedWriter.write("\nDeneyip Görücez");


        }catch(IOException e){
            System.out.println("Küücük bir hta olustu");
        }
    */
        ////////////////////////////BufferedReader
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("bufdenemesi"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Hata");
        }

    }
}