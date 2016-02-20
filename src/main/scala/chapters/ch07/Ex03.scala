package chapters.ch07

/**
  * Chapter 07, Example 03:
  * Write a package random with functions nextInt(): Int, nextDouble(): Double, and
  * setSeed(seed: Int): Unit. To generate random numbers, use the linear
  * congruential generator
  *
  *   next = previous × a + b mod 2n,
  *
  * where a = 1664525, b = 1013904223, and n = 32.
  */

package object random {
  var seed = System.nanoTime().toInt

  def setSeed(seed: Int): Unit = this.seed = seed

  def nextInt(): Int = next().toInt
  def nextDouble(): Double = next()

  private [this] def next(): Double = { val next = seed * 1664525 + 1013904223 % math.pow(2, 32); seed = next.toInt; next}
}


object Ex03 extends App {

  println(chapters.ch07.random.nextInt())

}