package Lektion16.Ubung4;

public class Roboter {

    public Entscheidung entscheide(Gefahr gefahr){
        switch (gefahr){
            case gefahr_links:
                return Entscheidung.rechts;
            case gefahr_rechts:
                return Entscheidung.links;
            case gefahr_vor:
                return Entscheidung.bremen;
            default:
                throw new IllegalStateException("Unbekannte Gefahr");
        }
    }
    public void aufladen() {
        System.out.println("Der Roboter lädt auf.");
    }

    public void warten() {
        System.out.println("Der Roboter wartet.");
    }

    public void arbeiten() {
        System.out.println("Der Roboter arbeitet.");
    }

    public void autofahren() {
        System.out.println("Der Roboter fährt Auto.");
    }
}
