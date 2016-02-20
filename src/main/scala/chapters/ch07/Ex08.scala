package chapters.ch07

/**
  * Chapter 07, Example 08:
  * What is the effect of
  *
  *   import java._
  *   import javax._
  *
  * Is this a good idea?
  */
object Ex08 extends App {

  // Imports all items from all of java and javax into the active namespace.

  // classes that exist in scala will conflict and refuse to compile (Boolean, Double, etc...)

}
