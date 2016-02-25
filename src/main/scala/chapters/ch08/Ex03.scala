package chapters.ch08

/**
  * Chapter 08, Example 03:
  * Consult your favorite Java or C++ textbook that is sure to have an example
  * of a toy inheritance hierarchy, perhaps involving employees, pets, graphical
  * shapes, or the like. Implement the example in Scala.
  */
object Ex03 extends App {

  abstract class Shape {
    def draw: String
  }

  class Rectangle(val x: Double, val y: Double, val w: Double, val h: Double) extends Shape {
    override def draw = "I'm a rectangle!"
  }

  class Square(x: Double, y: Double, w: Double) extends Rectangle(x, y, w, w) {
    override def draw = "I'm a square!"
  }

  class Triangle(x: Double, y: Double) extends Shape {
    override def draw = "I'm a triangle!"
  }
}
