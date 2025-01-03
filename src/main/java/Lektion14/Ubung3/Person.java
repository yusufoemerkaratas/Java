package Lektion14.Ubung3;

public class Person {
    private String vorname;
    private String nachname;
    private Adresse adresse;

    public Person(String vorname, String nachname, Adresse adresse) {
        if (vorname.charAt(0) >= 'A' && vorname.charAt(0) <= 'Z'
                && adresse.getOrt().charAt(0) >= 'A' && adresse.getOrt().charAt(0) <= 'Z'
                && adresse.getStrasse().charAt(0) >= 'A' && adresse.getStrasse().charAt(0) <= 'Z') {
            this.vorname = vorname;
            this.nachname = nachname;
            this.adresse = adresse;
        } else throw new RuntimeException();
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
