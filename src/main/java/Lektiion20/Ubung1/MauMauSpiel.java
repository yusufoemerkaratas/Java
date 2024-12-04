package Lektiion20.Ubung1;

public class MauMauSpiel {
    public static void main(String[] args) {

        Deck meinDeck = new Deck();
        System.out.println("Das Deck wird erstellt");

        meinDeck.shuffle(); //Mischung
        System.out.println("Das Deck wurde gemischt");

        Player meinSpieler = new Player();
        System.out.println("Der Spieler wurde erstellt");

        System.out.println("Dem Spieler werden 5 Karten ausgeteilt");
        for (int i = 0; i < 5; i++) {
            Card gezogeneKart = meinDeck.cardsWürf();
            System.out.println("Gezogene Karte: " + gezogeneKart);
            meinSpieler.addCard(gezogeneKart);
        }
        System.out.println();

        System.out.println("Karten in der Hand des Spielers:");
        meinSpieler.showHand();
    }
}
