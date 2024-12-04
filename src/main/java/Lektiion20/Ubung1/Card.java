package Lektiion20.Ubung1;

public class Card {
    Farbe farbe;
    Wert wert;

    Card(Farbe farbe, Wert wert){
    this.farbe=farbe;
    this.wert = wert;
    }

    @Override
    public String toString() {
        return farbe +" "+ wert;
    }


}
