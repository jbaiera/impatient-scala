package chapters.ch05

/**
  * Chapter 05, Example 07:
  * Write a class Person with a primary constructor that accepts a string containing
  * a first name, a space, and a last name, such as new Person("Fred Smith"). Supply
  * read-only properties firstName and lastName. Should the primary constructor
  * parameter be a var, a val, or a plain parameter? Why?
  */
object Ex07 extends App {

  class Person(fullname: String) {
    def firstName = fullname.split(" ").head
    def lastName = fullname.split(" ").tail.mkString(" ")
  }

}
