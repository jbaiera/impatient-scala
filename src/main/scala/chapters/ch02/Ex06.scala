package chapters.ch02

/**
  * Write a for loop for computing the product of the Unicode codes of all letters
  * in a string. For example, the product of the characters in "Hello" is 825152896.
  */
object Ex06 extends App {

  val s = "Hello"

  var product = 1

  for (each <- s) product *= each.toInt

  assert(825152896 == product)
}
