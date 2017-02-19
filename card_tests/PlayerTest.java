import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {

  Player player1;
  Hand hand;
  Card threeOfHearts;

  @Before
  public void before(){
    threeOfHearts = new Card(3, Suit.Hearts);
    hand = new Hand();
    hand.addCard(threeOfHearts);
    player1 = new Player("Steve", hand);
  }

  @Test
  public void testPlayerHasName(){
    assertEquals("Steve", player1.getName());
  }

  @Test
  public void testCanGetValueOfHand(){
    assertEquals(3, player1.getHandValue());
  }





}