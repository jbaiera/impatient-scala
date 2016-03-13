package chapters.ch09

import scala.io.Source

/**
  * Chapter 09, Example 07:
  * Write a Scala program that reads a text file and prints all tokens in the file
  * that are not floating-point numbers. Use a regular expression.
  */
object Ex07 extends App {

  val regex = """\s*\d*\.\d*\s*""".r

  Source
    .fromFile(getClass.getResource("/chapters/ch09/totesfloats.txt").toURI)
    .getLines()
    .map(regex.replaceAllIn(_, " "))
    .flatMap(_.split(' '))
    .foreach(println(_))
}
