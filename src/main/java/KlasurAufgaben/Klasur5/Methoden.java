package KlasurAufgaben.Klasur5;

import java.io.*;
import java.util.*;

public  class Methoden {
    public static void checkIban(String iban) throws FalcheIBANException {
        if(iban.length()!=22) throw new FalcheIBANException("Iban muss 22 charakter enthalten");
        if(iban.charAt(0)!='D'||iban.charAt(1)!='E') throw new FalcheIBANException("Die eingegebene IBAN mus mit DE anfangen");
            String zeichen=iban.substring(2);

            if(!zeichen.matches("\\d+")) throw new FalcheIBANException("Es muss 20 zahl enthalten");
        }
    public List<String> liestIbanAusDatei(String dateiname) throws FileNotFoundException, IOException {
        File file=new File(dateiname);
        List<String> falscheIban=new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            while((line=bufferedReader.readLine())!=null){
                try{
                    checkIban(line);
                } catch (FalcheIBANException e) {
                    falscheIban.add(line);
                }
            }
        }
        return falscheIban;
    }

    public Map<String,List<String>> liestIbanAusDatein(ArrayList<File> files) throws FileNotFoundException,IOException{
        Map<String,List<String>> mymap=new HashMap<>();
        for(File file : files){
          mymap.put(file.getName(), liestIbanAusDatei(file.getName()));
        }
        return mymap;

    }














}
