package card_game;
import card_game.*;

import java.util.ArrayList;

public class Hand {
  private ArrayList<Card> cards;

  public Hand(){
    this.cards = new ArrayList<Card>();
  }

  public void addCard(Card card){
    cards.add(card);
  }

  public int getValue(){
    int total = 0;
    for (Card card : cards){
      total += card.getValue();
    }
    return total;
  }

  public void showHand(){
    for(Card card : cards){
      System.out.println(card.toString());
    }
  }
}