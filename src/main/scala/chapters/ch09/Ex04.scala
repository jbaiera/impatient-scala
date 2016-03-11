package chapters.ch09

import chapters.ch09.Ex03._

import scala.io.Source

/**
  * Chapter 09, Example 04:
  * Write a Scala program that reads a text file containing only floating-point
  * numbers. Print the sum, average, maximum, and minimum of the numbers
  * in the file.
  */
object Ex04 extends App {
  val sum = Source
    .fromFile(getClass.getResource("/chapters/ch09/floats.txt").toURI)
    .getLines()
    .map(_.toFloat)
    .sum

  val count = Source
    .fromFile(getClass.getResource("/chapters/ch09/floats.txt").toURI)
    .getLines()
    .size

  val avg = sum / count.toFloat

  val max = Source
    .fromFile(getClass.getResource("/chapters/ch09/floats.txt").toURI)
    .getLines()
    .map(_.toFloat)
    .max

  val min = Source
    .fromFile(getClass.getResource("/chapters/ch09/floats.txt").toURI)
    .getLines()
    .map(_.toFloat)
    .min

  println(sum)
  println(count)
  println(avg)
  println(max)
  println(min)
}
