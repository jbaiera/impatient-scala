package chapters.ch04

/**
  * Set up a map of prices for a number of gizmos that you covet. Then produce
  * a second map with the same keys and the prices at a 10 percent discount.
  */
object Ex01 extends App {

  val gizmos = Map("Computer" -> 1400.00, "Car" -> 18000.00, "Bike" -> 840.00)

  val discount = for((key, value) <- gizmos) yield (key, value - (value * 0.1))

  println(discount)
}
