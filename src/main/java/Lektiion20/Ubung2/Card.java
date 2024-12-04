package Lektiion20.Ubung2;

public class Card implements  Comparable<Card> {
    Farbe farbe;
    Wert wert;

    Card(Farbe farbe, Wert wert) {
        this.farbe = farbe;
        this.wert = wert;
    }

    @Override
    public String toString() {
        return farbe + " " + wert;

    }

    @Override
    public int compareTo(Card other) {
        boolean first;
        boolean second;
        if (this.wert.equals(Wert.BUBE)) {
            first = true;
        } else {
            first = false;
        }
        if (other.wert.equals(Wert.BUBE)) {
            second = true;
        } else {
            second = false;
        }
        if (first && second) {
            int firstInt = this.farbe.ordinal();
            int secondInt = other.farbe.ordinal();
            return Integer.compare(secondInt, firstInt);
        } else if (first || second) {
            int firstInt = this.wert.ordinal();
            int secondInt = other.wert.ordinal();
            return Integer.compare(secondInt, firstInt);
        } else {
            int a = this.farbe.ordinal();
            int b = other.farbe.ordinal();

            if (a == b) {
                int c = this.wert.ordinal();
                int d = other.wert.ordinal();
                return Integer.compare(d,c);
            } else {
                return Integer.compare(b,a);
            }
        }
    }



}
