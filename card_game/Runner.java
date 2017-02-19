package card_game;
import card_game.*;
import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {
    System.out.println("Enter your name: ");
    String name = System.console().readLine();
    System.out.println();

    Player player = new Player(name, new Hand());
    Player dealer = new Player("Dealer", new Hand());
    Player[] players = {player, dealer};
    Deck deck = new Deck(new ArrayList<Card>());
    Game game = new Game(players, deck);

    game.play();
  }
}




