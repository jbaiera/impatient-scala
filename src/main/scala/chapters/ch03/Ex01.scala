package chapters.ch03

import scala.util.Random

/**
  * Write a code snippet that sets a to an array of n random integers between 0
  * (inclusive) and n (exclusive).
  */
object Ex01 {

  val n = 10
  val a = new Array[Int](n)

  for (each <- 0 until n) a(each) = Random.nextInt(n)

}
