package chapters.ch06

/**
  * Chapter 06, Example 04:
  * Define a Point class with a companion object so that you can construct Point
  * instances as Point(3, 4), without using new.
  */
object Ex04 extends App {

  class Point(val x: Int, val y: Int)

  object Point {
    def apply(x: Int, y: Int): Point = new Point(x, y)
  }

  val p = Point(10, 20)

}
