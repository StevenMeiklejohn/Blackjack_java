package card_game;
import card_game.*;
import java.util.ArrayList;

public class Game{

  private Player[] players;
  private Deck deck;

  public Game(Player[] players, Deck deck){

    this.players = players;
    this.deck = deck;
  }

  public void dealCards(){
    Card card;
    for(Player player : players){
      deck.dealCard(player);
    }
    for(Player player : players){
      deck.dealCard(player);
    }
    for(Player player : players){
      System.out.println("");
      System.out.println("=======");
      System.out.println(player.name +" has");
      System.out.println("=======");
      player.showHand();
    }
  }
  

  public void checkWinner(){
    if(players[0].getHandValue() > players[1].getHandValue()){
      System.out.println("");
      System.out.println(players[0].name + " wins with " + players[0].getHandValue());
    }
    else if (players[0].getHandValue() < players[1].getHandValue()) {
      System.out.println("");
      System.out.println(players[1].name + " wins with " + players[1].getHandValue());
    }
    else {
      System.out.println("");
      System.out.println("Both players have " + players[0].getHandValue());
    }
  }

  public void play(){
    deck.shuffle();
    dealCards();
    checkWinner();
  }

}