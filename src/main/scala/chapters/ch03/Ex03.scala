package chapters.ch03

/**
  * Repeat the preceding assignment, but produce a new array with the swapped
  * values. Use for/yield.
  */
object Ex03 {

  def swapAdjacents(a: Array[Int]) = for (idx <- a.indices) yield {
    if(idx % 2 == 1) a(idx - 1) // mod 2 == 1 always gets the value from previous place
    else if (a.length < idx + 1) a(idx) // otherwise check if we're out of bounds on the end
    else a(idx + 1) // if not, then get value from the next place
  }

}
