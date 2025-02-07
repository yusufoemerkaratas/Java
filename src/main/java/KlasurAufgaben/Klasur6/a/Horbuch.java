package KlasurAufgaben.Klasur6.a;

public class Horbuch extends Buch{
    String sprecher;
    int laenge;

    Horbuch(String name, String autor, String verlag, int preisInCents,String sprecher,int laenge){
        super(name,autor,verlag,preisInCents);
        this.sprecher=sprecher;
        this.laenge = laenge;
    }

}
