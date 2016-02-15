package chapters.ch03

/**
  * Write a loop that swaps adjacent elements of an array of integers. For example,
  * Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
  */
object Ex02 {
  def swapAdjacents(a: Array[Int]): Array[Int] = {
    for (i <- a.indices by 2 if i+1 < a.length) { val t = a(i); a(i) = a(i+1); a(i+1) = t }
    a
  }
}
