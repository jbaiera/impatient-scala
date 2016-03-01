package chapters.ch08

/**
  * Chapter 08, Example 07:
  * Provide a class Square that extends java.awt.Rectangle and has three constructors:
  * one that constructs a square with a given corner point and width, one that
  * constructs a square with corner (0, 0) and a given width, and one that constructs
  * a square with corner (0, 0) and width 0.
  */
object Ex07 extends App {

  class Square(x: Int, y: Int, w: Int) extends java.awt.Rectangle(x, y, w, w) {
    def this(w: Int) {
      this(0,0,w)
    }

    def this() {
      this(0,0,0)
    }
  }

}
