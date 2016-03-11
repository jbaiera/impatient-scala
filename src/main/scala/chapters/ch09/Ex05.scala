package chapters.ch09

import java.io.PrintWriter

/**
  * Chapter 09, Example 05:
  * Write a Scala program that writes the powers of 2 and their reciprocals to a
  * file, with the exponent ranging from 0 to 20. Line up the columns:
  *   1   1
  *   2   0.5
  *   4   0.25
  *   ... ...
  */
object Ex05 extends App {

  val out = new PrintWriter("out/numbers.txt")

  for (idx <- 1 to 20) {
    val pow = math.pow(2, idx).toInt
    val reciprocal = 1 / pow.toDouble

    out.println("%7d %10f".format(pow, reciprocal))
  }

  out.close()

}
