package Lektion20.Ubung2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Deck meinDeck = new Deck();
        meinDeck.shuffle();
        System.out.println("Deck wurde gemischt");

        Player meinSpieler = new Player();
        for (int i = 0; i < 10; i++) {
            meinSpieler.addCard(meinDeck.cardsWürf());
        }
        System.out.println("\nDas Hand vom Spieler bevor");
        meinSpieler.showHand();

        meinSpieler.hand.sort(Comparator.naturalOrder()); // `Card` sınıfındaki `compareTo` metodunu kullanır

        System.out.println("\n\nNachdem Wir sortiert haben:");
        meinSpieler.showHand();
        System.out.println();

    }
}
