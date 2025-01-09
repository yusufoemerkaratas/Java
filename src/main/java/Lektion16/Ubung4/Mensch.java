package Lektion16.Ubung4;

import java.util.Random;

public class Mensch {
    int randomNumber = (int) (Math.random() * 4);

    public Entscheidung entscheide(Gefahr gefahr){
        if(randomNumber==0){
            return Entscheidung.unentscheiden;
        }

        switch (gefahr){
            case gefahr_links:
                return Entscheidung.rechts;
            case gefahr_vor:
                return Entscheidung.bremen;
            case gefahr_rechts:
                return Entscheidung.links;
            default: throw new IllegalStateException("Unbekannte Gefahr");

        }
    }
    public void essen() {
        System.out.println("Der Mensch isst.");
    }

    public void schlafen() {
        System.out.println("Der Mensch schläft.");
    }

    public void arbeiten() {
        System.out.println("Der Mensch arbeitet.");
    }

    public void autofahren() {
        System.out.println("Der Mensch fährt Auto.");
    }

}
