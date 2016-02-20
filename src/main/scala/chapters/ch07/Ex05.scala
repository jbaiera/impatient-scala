package chapters.ch07

/**
  * Chapter 07, Example 05:
  * What is the meaning of private[com] def giveRaise(rate: Double)? Is it useful?
  */
object Ex05 extends App {

  // It allows only classes from the com package to use the method as described.
  // This is helpful in situations where you don't want to break encapsulation,
  // but do want to separate code on package boundaries.

  // It might not be super useful if the package given is super general though.

}
