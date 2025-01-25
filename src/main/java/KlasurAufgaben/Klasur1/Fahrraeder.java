package KlasurAufgaben.Klasur1;

public class Fahrraeder extends  Fahrzeug{
    private static final double kosten_per_min=0.125;

    @Override
    public double berechneEntgelt(Fahrt fahrt){
        return kosten_per_min* fahrt.min;
    }
}
