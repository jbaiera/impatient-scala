package chapters.ch05

/**
  * Chapter 05, Example 06:
  * In the Person class of Section 5.1, “Simple Classes and Parameterless Methods,”
  * on page 51, provide a primary constructor that turns negative ages to 0.
  */
object Ex06 extends App {

  class Person(var age: Int) {
    age = if (age < 0) 0 else age
  }


}
        