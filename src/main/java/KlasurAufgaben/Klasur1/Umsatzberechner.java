package KlasurAufgaben.Klasur1;

import java.util.ArrayList;
import java.util.List;

public class Umsatzberechner {
    public double berechneGesamtUmsatz(Garage garage){
        double sum=0;
        for(Fahrzeug fahrzeug : garage.alleFahrzeuge){
            for(Fahrt fahrt : fahrzeug.fahrtenBuch){
                sum+= fahrzeug.berechneEntgelt(fahrt);
            }
        }
        return sum;
    }
}
