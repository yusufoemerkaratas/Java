package Lektion15.Ubung1;

public class Abteilungsleiter extends Angestellter{
    private int gehaltsfaktor;
    public Abteilungsleiter(String name, int id, String vorname, int grundgehalt, String geburtsdatum) {
        super(name, id, vorname, grundgehalt, geburtsdatum);
        this.gehaltsfaktor=2;
    }
    @Override
    public double getGehalt(){
        return this.gehaltsfaktor*super.getGrundgehalt();
    }

    public void befördern(Angestellter a){
        a.setGehaltsfaktor(a.getGehaltsfaktor()*1.1);
    }

}
