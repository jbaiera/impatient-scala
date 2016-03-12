package chapters.ch09

import scala.io.Source

/**
  * Chapter 09, Example 06:
  * Make a regular expression searching for quoted strings "like this, maybe with
  * \" or \\" in a Java or C++ program. Write a Scala program that prints out all
  * such strings in a source file.
  */
object Ex06 extends App {

  val stringRegex = """"[A-Za-z ,\\"]*"""".r

  val test = "like this, maybe with \" or \\"

  /*
   * This actually picks up the regex quotes, the test string, AND the string in the file doc comment.
   */
  println(
    Source
      .fromFile("src/main/scala/chapters/ch09/Ex06.scala")
      .getLines()
      .flatMap(stringRegex.findAllMatchIn(_))
      .map(_.matched)
      .toList
  )
}
