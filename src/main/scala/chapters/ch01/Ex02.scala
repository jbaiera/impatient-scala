package chapters.ch01

/**
  * In the Scala REPL, compute the square root of 3, and then square that value.
  * By how much does the result differ from 3? (Hint: The res variables are your
  * friend.)
  */
object Ex02 extends App {

  val sr3 = math.sqrt(3)
  val squared = math.pow(sr3, 2)

  println(3 - squared)
}
