package card_game;
import card_game.*;
import java.util.ArrayList;
import java.util.Collections;

public class Deck{

  private ArrayList<Card> cards;

  public Deck(ArrayList<Card> cards){
    this.cards = cards;
    populate();
  }

  public void populate(){
    for (Suit suit : Suit.values()) {
      for(int i = 1; i < 14; i++){
        cards.add(new Card(i, suit));
      }
    }
  }

  public void shuffle(){
    Collections.shuffle(cards);
  }

  public Card dealCard(Player player){
    Card card = cards.get(0);
    player.addCardToHand(card);
    cards.remove(0);
    return card;
  }



}