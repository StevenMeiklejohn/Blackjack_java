package card_game;
import card_game.*;


public class Card{
  private final int number;
  private final Suit suit;

  public Card(int number, Suit suit){
    if (number > 13 || number < 1) {
      throw new IllegalArgumentException("Number must be between 1 and 13");
    }
    this.number = number;
    this.suit = suit;
  }

  public int getNumber(){
    return this.number;
  }

  public int getValue(){
    if(this.number > 10){
      return 10;
    }
    else{
      return this.number;
    }
  }

  public Suit getSuit(){
    return this.suit;
  }

  @Override
  public String toString(){
    String[] numberStrings = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
    return numberStrings[this.number - 1] + " of " + suit.name();
  }


}