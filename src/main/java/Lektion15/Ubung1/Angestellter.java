package Lektion15.Ubung1;

public class Angestellter {
    private String name;
    private String vorname;
    private int id;
    private int grundgehalt;
    private double gehaltsfaktor;
    private String geburtsdatum;

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    private double gehalt;


    public Angestellter(String name, int id, String vorname, int grundgehalt, String geburtsdatum) {
        this.name = name;
        this.id = id;
        this.vorname = vorname;
        this.grundgehalt = grundgehalt;
        this.gehaltsfaktor =1;
        this.geburtsdatum = geburtsdatum;
        this.gehalt=gehaltsfaktor*grundgehalt;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(int grundgehalt) {
        this.grundgehalt = grundgehalt;
    }

    public double getGehaltsfaktor() {
        return gehaltsfaktor;
    }

    public void setGehaltsfaktor(double gehaltsfaktor) {
        this.gehaltsfaktor = gehaltsfaktor;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
}
