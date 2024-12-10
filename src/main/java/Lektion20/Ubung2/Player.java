package Lektion20.Ubung2;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> hand;

    Player() {
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        if (hand.contains(card)) {
            System.out.println("Bu kart zaten elde var: " + card);
            return;
        }
        hand.add(card);
    }

    public void showHand(){
        for(Card c : hand){
            System.out.print(c.toString()+",");
        }
    }
}