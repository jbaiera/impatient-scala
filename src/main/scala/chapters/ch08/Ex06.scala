package chapters.ch08

import chapters.ch08.Ex05.Point

/**
  * Chapter 08, Example 06:
  * Define an abstract class Shape with an abstract method centerPoint and subclasses
  * Rectangle and Circle. Provide appropriate constructors for the subclasses and
  * override the centerPoint method in each subclass.
  */
object Ex06 extends App {

  abstract class Shape {
    def centerPoint: Point
  }

  class Rectangle(val x: Double, val y: Double, val w: Double, val h: Double) extends Shape {
    override def centerPoint = new Point(x + (w/2), y + (h/2))
  }

  class Circle(val centerPoint: Point, val radius: Double) extends Shape
}
