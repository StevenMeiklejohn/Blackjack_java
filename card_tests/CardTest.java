import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

  Card threeOfHearts;

  @Before
  public void before(){
    threeOfHearts = new Card(3, Suit.Hearts);
  }

  @Test
  public void testCardHasNumber(){
    assertEquals(3, threeOfHearts.getNumber());
  }

  @Test
  public void testCardHasSuit(){
    assertEquals(Suit.Hearts, threeOfHearts.getSuit());
  }

  @Test
  public void testCanPrintCardToString(){
    assertEquals("Three of Hearts", threeOfHearts.toString());
  }



}