package Lektion20.Ubung2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    Deck(){
        this.cards=new ArrayList<>();
        for(Farbe far : Farbe.values()){
            for(Wert wert : Wert.values()){
                cards.add(new Card(far, wert));
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public Card cardsWürf(){
        if(cards.isEmpty()){
            System.out.println("Decke ist leer");
        }
        return cards.remove(0);
    }
}
