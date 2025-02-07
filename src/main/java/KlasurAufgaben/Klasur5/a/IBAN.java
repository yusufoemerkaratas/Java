package KlasurAufgaben.Klasur5.a;

import java.io.*;
import java.util.*;

public class IBAN {
    public static boolean checkIBAN(String iban) {
        if(iban.length()!=22) throw new FalscheIBANException("IBAN muss 20 stellig sein");
        if(iban.charAt(0)>='A'&& iban.charAt(0)<'Z'&& iban.charAt(1)>'A'&& iban.charAt(1)<'Z') throw new FalscheIBANException("blablabla");
        return true;

    }

    public  static List<String> liestDatei(String path){
        List<String> array=new ArrayList<>();
        try(BufferedReader buf=new BufferedReader(new FileReader(path))){
            String line;
            while((line=buf.readLine())!=null){
                try{
                        checkIBAN(line);
                }catch(FalscheIBANException e){
                    array.add(line);
                }
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        return array;
    }
    public static Map<String,List<String>> liesAusDatein(List<String> datein){
        Map<String,List<String>> myMap=new HashMap<>();
        for(String dataname: datein){
            List<String> ibans=liestDatei(dataname);
            myMap.put(dataname,ibans);
        }
        return myMap;

    }




}

