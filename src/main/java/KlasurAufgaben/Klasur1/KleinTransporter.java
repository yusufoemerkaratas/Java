package KlasurAufgaben.Klasur1;

public class KleinTransporter extends Fahrzeug{
     @Override
    public double berechneEntgelt(Fahrt fahrt){
         if(fahrt.min<=60) return 0.3*fahrt.km;
         else return  0.3* fahrt.km+0.25*(fahrt.min-60);
     }
}
