package Lektion14.Ubung3;

public class Adresse {
    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;

    public Adresse(String strasse, String ort, String plz, String hausnummer) {
        this.strasse = strasse;
        this.ort = ort;
        this.plz = plz;
        this.hausnummer = hausnummer;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
