package chapters.ch02

/**
  * Write a function product(s : String) that computes the product, as described
  * in the preceding exercises.
  */
object Ex08 extends App {

  // Already built this in the last one so I guess I'll just go a new way:

  def product(s: String) = s.map(_.toInt).product

  assert(825152896 == "Hello".map(_.toInt).product)

}
