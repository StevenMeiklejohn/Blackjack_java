import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;

public class HandTest {

  Hand hand;
  Card card;

  @Before
  public void beforeEach() {
    hand = new Hand();
    card = new Card(1, Suit.Spades);
    hand.addCard(card);
  }

  @Test
  public void canAddCard(){
    assertEquals(1, hand.getValue());
  }


}