package Lektiion20.Ubung1;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> hand;

    Player() {
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        if (hand.contains(card)) {
            System.out.println("Diese Card existiert schon " + card);
            return;
        }
        hand.add(card);
    }

    public void showHand(){
        for(Card c : hand){
            System.out.print(c.toString()+" ");
        }
    }
}