package chapters.ch09

import scala.io.Source

/**
  * Chapter 09, Example 02:
  * Write a Scala program that reads a file with tabs, replaces each tab with spaces
  * so that tab stops are at n-column boundaries, and writes the result to the
  * same file.
  */
object Ex02 extends App {

  val tabStop = 4

  Source.fromFile(getClass.getResource("/chapters/ch09/tabbed.txt").toURI)
      .flatMap((c) => if (c == '\t') " " * tabStop else Array(c))
      .foreach(print(_))
}
