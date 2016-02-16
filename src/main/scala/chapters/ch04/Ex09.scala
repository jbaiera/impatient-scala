package chapters.ch04

/**
  * Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing
  * the counts of values less than v, equal to v, and greater than v.
  */
object Ex09 extends App {

  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
    var less = 0
    var more = 0
    var eq = 0
    for (i <- values) {
      less = if (i < v) less + 1 else less
      more = if (i > v) more + 1 else more
      eq = if (i == v) eq + 1 else eq
    }
    (less, eq, more)
  }

  println(lteqgt(Array(1, 2, 3, 4, 5, 6, 7), 5))
}
