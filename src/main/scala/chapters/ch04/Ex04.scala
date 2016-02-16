package chapters.ch04

import java.util.Scanner

/**
  * Repeat the preceding exercise with a sorted map, so that the words are
  * printed in sorted order.
  */
object Ex04 extends App {
  var countMap = collection.immutable.TreeMap[String, Int]()
  def process(s: String): Unit = {
    val count = countMap.getOrElse(s, 0)
    countMap = countMap + (s -> (count + 1))
  }

  val in = new Scanner(Ex02.getClass.getClassLoader.getResourceAsStream("chapters/ch04/text.txt"))
  while (in.hasNext()) process(in.next().toLowerCase)

  println(countMap)
}
