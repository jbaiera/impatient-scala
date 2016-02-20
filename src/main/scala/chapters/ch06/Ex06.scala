package chapters.ch06

/**
  * Chapter 06, Example 06:
  * Write an enumeration describing the four playing card suits so that the toString
  * method returns ♣, ♦, ♥, or ♠.
  */
object Ex06 extends App {

  object Suits extends Enumeration {
    type Suit = Value

    val Clubs = Value(0, "♣")
    val Diamonds = Value(1, "♦")
    val Hearts = Value(2, "♥")
    val Spades = Value(3, "♠")
  }

  import Suits._

  def suit: Suit = Suits.Clubs
}
