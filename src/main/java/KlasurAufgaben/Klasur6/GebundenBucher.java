package KlasurAufgaben.Klasur6;

public class GebundenBucher extends Buch{
   public  int seitenAnzahl;

    public GebundenBucher(String name, String autor, String verlag, int preisInCents, int seitenAnzahl,String reihename) {
        super(name, autor, verlag, preisInCents,reihename);
        this.seitenAnzahl = seitenAnzahl;
    }
}
