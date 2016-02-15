package chapters.ch03

/**
  * Given an array of integers, produce a new array that contains all positive
  * values of the original array, in their original order, followed by all values that
  * are zero or negative, in their original order.
  */
object Ex04 extends App {

  val xs = Array(1,-2,3,-4,5,-6,7,-8)

  val positiveIndices = for (idx <- xs.indices if xs(idx) > -1) yield idx
  val negativeIndices = for (idx <- xs.indices if xs(idx) < 0) yield idx

  val xss = for (idx <- positiveIndices ++ negativeIndices) yield xs(idx)

  println(xss)
}
