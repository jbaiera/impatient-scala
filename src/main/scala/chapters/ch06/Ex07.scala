package chapters.ch06

import chapters.ch06.Ex06.Suits

/**
  * Chapter 06, Example 07:
  * Implement a function that checks whether a card suit value from the preceding
  * exercise is red.
  */
object Ex07 extends App {

  import Ex06.Suits._

  def isRed(suit: Suit): Boolean = Set(Suits.Diamonds, Suits.Hearts).contains(suit)

}
