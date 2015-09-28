package chapters.ch10

import java.awt.Point

/**
 * Defind a class OrderedPoint by mixing scala.math.Ordered[Point] into
 * java.awt.Point. Use lexicographic ordering.
 */
object Ex02 extends App {

  class OrderedPoint(sx: Int, sy: Int) extends java.awt.Point(sx, sy) with Ordered[java.awt.Point] {
    override def compare(that: Point): Int = {
      val x = this.x.compareTo(that.x)
      if(x != 0) x else y.compareTo(that.y)
    }
  }

  val p00 = new OrderedPoint(0,0)
  val p01 = new OrderedPoint(0,1)
  val p10 = new OrderedPoint(1,0)
  val p11 = new OrderedPoint(1,1)

  assert (p00 <= p00)
  assert (p00 >= p00)

  assert (p00 < p01)
  assert (p01 < p10)
  assert (p10 < p11)
}
