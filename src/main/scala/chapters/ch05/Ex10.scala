package chapters.ch05

/**
  * Chapter 05, Example 10:
  * Consider the class
  *
  *   class Employee(val name: String, var salary: Double) {
  *    def this() { this("John Q. Public", 0.0) }
  *   }
  *
  * Rewrite it to use explicit fields and a default primary constructor. Which form
  * do you prefer? Why?
  */
object Ex10 extends App {

  class Employee(val name: String = "John Q. Public", var salary: Double = 0.0)

  // I like this form because it's all in one place. Is that what you wanted to hear, Cay?

}
