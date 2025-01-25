package KlasurAufgaben.Klasur1;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    List<Fahrzeug> alleFahrzeuge= new ArrayList<>();


    public Garage(List<Fahrzeug> alleFahrzeuge) {
        this.alleFahrzeuge = alleFahrzeuge;
    }
    public void add(Fahrzeug a ){
        alleFahrzeuge.add(a);
    }
}
