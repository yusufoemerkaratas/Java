package KlasurAufgaben.Klasur6;

public class HorBuch extends  Buch{
    public String sprecher;
    public int laenge;

    public HorBuch(String name, String autor, String verlag, int preisInCents, String sprecher, int laenge,String reihename) {
        super(name, autor, verlag, preisInCents,reihename);
        this.sprecher = sprecher;
        this.laenge = laenge;
    }
}
