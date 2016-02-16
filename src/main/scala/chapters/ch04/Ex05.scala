package chapters.ch04

import java.util.Scanner

/**
  * Repeat the preceding exercise with a java.util.TreeMap that you adapt to the
  * Scala API
  */
object Ex05 extends App {

  import collection.JavaConversions._

  var countMap: collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]()
  def process(s: String): Unit = {
    val count = countMap.getOrElseUpdate(s, 0)
    countMap(s) = count + 1
  }

  val in = new Scanner(Ex02.getClass.getClassLoader.getResourceAsStream("chapters/ch04/text.txt"))
  while (in.hasNext()) process(in.next().toLowerCase)

  println(countMap)

}
