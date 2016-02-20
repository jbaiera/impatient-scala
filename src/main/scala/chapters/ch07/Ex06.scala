package chapters.ch07

import java.util.{HashMap => JavaMap}
import scala.collection.mutable.{HashMap => ScalaMap}

/**
  * Chapter 07, Example 06:
  * Write a program that copies all elements from a Java hash map into a Scala
  * hash map. Use imports to rename both classes.
  */
object Ex06 extends App {

  val javaMap = new JavaMap[Int, Int]()
  javaMap.put(1, 1)
  javaMap.put(2, 2)
  javaMap.put(3, 3)

  val scalaMap = new ScalaMap[Int, Int]()

  val it = javaMap.entrySet().iterator()
  while (it.hasNext) {
    val entry = it.next()
    scalaMap += entry.getKey -> entry.getValue
  }

  println(scalaMap)

}
