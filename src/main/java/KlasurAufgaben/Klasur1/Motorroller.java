package KlasurAufgaben.Klasur1;

public class Motorroller extends Fahrzeug{
    private static final double kosten_per_km=3;
    @Override
    public double berechneEntgelt(Fahrt fahrt){
        return 3 + 0.15* fahrt.km;
    }
}
