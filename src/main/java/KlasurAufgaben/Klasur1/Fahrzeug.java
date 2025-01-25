package KlasurAufgaben.Klasur1;

import java.util.*;

 abstract class Fahrzeug {
    protected   List<Fahrt> fahrtenBuch;
    Fahrzeug(){
        this.fahrtenBuch=new ArrayList<>();
    }
    public void addFahrt(Fahrt fahrt){
        fahrtenBuch.add(fahrt);
    }
    public abstract double berechneEntgelt(Fahrt fahrt);
}
