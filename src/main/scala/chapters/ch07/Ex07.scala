package chapters.ch07

/**
  * Chapter 07, Example 07:
  * In the preceding exercise, move all imports into the innermost scope possible.
  */
object Ex07 extends App {

  import java.util.{HashMap => JavaMap}
  import scala.collection.mutable.{HashMap => ScalaMap}

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
