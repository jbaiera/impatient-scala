package chapters.ch04

/**
  * Write a function minmax(values: Array[Int]) that returns a pair containing the
  * smallest and largest values in the array.
  */
object Ex08 extends App {

  def minmax(values: Array[Int]): (Int, Int) = {
    var max = Integer.MIN_VALUE
    var min = Integer.MAX_VALUE
    for (v <- values) {
      max = if (v > max) v else max
      min = if (v < min) v else min
    }

    min -> max
  }

  println(minmax(Array(3, 4, 6, 2, 1)))

}
