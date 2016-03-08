package chapters.ch09

import scala.io.Source

/**
  * Chapter 09, Example 01:
  * Write a Scala code snippet that reverses the lines in a file (making the last
  * line the first one, and so on).
  */
object Ex01 extends App {

  val reversed = Source
    .fromFile(getClass.getResource("/chapters/ch09/text.txt").toURI)
    .getLines()
    .foldLeft(Seq[String]())((l, v) => v +: l)

  println(reversed.mkString("\n"))
}
