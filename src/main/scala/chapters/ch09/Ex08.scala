package chapters.ch09

import java.net.URL

import scala.io.Source

/**
  * Chapter 09, Example 08:
  * Write a Scala program that prints the src attributes of all img tags of a web
  * page. Use regular expressions and groups.
  */
object Ex08 extends App {

  val imgregex = """<img.*src=".*".*/>""".r

  println(
    imgregex.findAllMatchIn(
      Source.fromURL(new URL("http://www.imgur.com")).mkString
    ).map(_.matched).mkString("\n")
  )

}
