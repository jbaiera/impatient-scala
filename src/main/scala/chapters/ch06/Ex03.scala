package chapters.ch06

/**
  * Chapter 06, Example 03:
  * Define an Origin object that extends java.awt.Point. Why is this not actually a
  * good idea? (Have a close look at the methods of the Point class.)
  */
object Ex03 extends App {

  object Origin extends java.awt.Point(0,0)

  Origin.setLocation(1,1) // means that this is mutable, and is probably not what you want...

}
