package Lektion18;

import java.io.*;

public class Ubung {
    public void splitStudiengaenge(String dataeiname) throws IOException, MatrikelNummerException   {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dataeiname));
             BufferedWriter winfwriter = new BufferedWriter(new FileWriter("WInfNr.txt"));
             BufferedWriter infwriter = new BufferedWriter(new FileWriter("InfNr.txt"));
             BufferedWriter ecwriter = new BufferedWriter(new FileWriter("ECNr.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if(line==null || line.isEmpty()) continue;
                int matrikelnummer;
                try {
                    matrikelnummer = Integer.parseInt(line.trim());
                } catch (NumberFormatException e) {
                    throw new MatrikelNummerException(e.getMessage());
                }
                if (matrikelnummer >= 5000000 && matrikelnummer <= 5099999) {
                    winfwriter.write(line);
                    winfwriter.newLine();
                } else if (matrikelnummer >= 5100000 && matrikelnummer <= 5199999) {
                    infwriter.write(line);
                    infwriter.newLine();
                } else if (matrikelnummer >= 6100000 && matrikelnummer <= 6199999) {
                    ecwriter.write(line);
                    ecwriter.newLine();
                } else {
                    throw new MatrikelNummerException("Ungultige Matrikelnummer");
                }
            }
        } catch (IOException e) {
            System.out.println("Hata");
        }
    }

}

