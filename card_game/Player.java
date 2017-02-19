
package card_game;
import card_game.*;

public class Player{

  public String name;
  private Hand hand;

  public Player(String name, Hand hand){

    this.name = name;
    this.hand = hand;
  }

  public String getName(){
    return this.name;
  }

  public void addCardToHand(Card card){
    hand.addCard(card);
  }

  public int getHandValue(){
    return hand.getValue();
  }

  public void showHand(){
    hand.showHand();
  }



}