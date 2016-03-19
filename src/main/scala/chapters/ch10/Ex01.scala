package chapters.ch10

import java.awt.geom.Ellipse2D

/**
  * Chapter 10, Example 01:
  * Define a trait "RectangleLike" with concrete methods translate and grow.
  * Provide any abstract methods that you need for the implementation so that
  * you can mix in the trait
  */
object Ex01 extends App {

  trait RectangleLike {
    def setFrame(x: Double, y: Double, h: Double, w: Double)
    def getX : Double
    def getY : Double
    def getHeight : Double
    def getWidth : Double

    def translate(dx: Double, dy: Double): Unit = {
      setFrame(getX + dx, getY + dy, getHeight, getWidth)
    }

    def grow(dx:Double, dy:Double): Unit = {
      setFrame(getX, getY, getHeight + dx, getWidth + dy)
    }
  }

  var ellipse = new Ellipse2D.Double(0,0,0,0) with RectangleLike
  ellipse.grow(10, 20)
  ellipse.translate(5, 10)

  assert(ellipse.x == 5)
  assert(ellipse.y == 10)
  assert(ellipse.height == 10)
  assert(ellipse.width == 20)
}
