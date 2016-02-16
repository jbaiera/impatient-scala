package chapters.ch04

import java.util.Scanner

/**
  * Write a program that reads words from a file. Use a mutable map to count
  * how often each word appears. To read the words, simply use a java.util.Scanner:
  *
  *   val in = new java.util.Scanner(java.io.File("myfile.txt"))
  *   while (in.hasNext()) process in.next()
  *
  * Or look at Chapter 9 for a Scalaesque way.
  * At the end, print out all words and their counts.
  */
object Ex02 extends App {

  val countMap = collection.mutable.Map[String, Int]()
  def process(s: String): Unit = {
    val count = countMap.getOrElseUpdate(s, 0)
    countMap(s) = count + 1
  }

  val in = new Scanner(Ex02.getClass.getClassLoader.getResourceAsStream("chapters/ch04/text.txt"))
  while (in.hasNext()) process(in.next().toLowerCase)

  println(countMap)
}
