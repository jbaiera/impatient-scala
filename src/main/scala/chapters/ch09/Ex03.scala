package chapters.ch09

import chapters.ch09.Ex01._

import scala.io.Source

/**
  * Chapter 09, Example 03:
  * Write a Scala code snippet that reads a file and prints all words with more
  * than 12 characters to the console. Extra credit if you can do this in a single line.
  */
object Ex03 extends App {
  Source
    .fromFile(getClass.getResource("/chapters/ch09/text.txt").toURI)
    .getLines()
    .toSeq
    .flatMap(_.split(' '))
    .filter(_.length > 12)
    .foreach(println(_))
}
