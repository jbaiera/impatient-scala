package chapters.ch06

/**
  * Chapter 06, Example 05:
  * Write a Scala application, using the App trait, that prints the command-line
  * arguments in reverse order, separated by spaces. For example, scala Reverse
  * Hello World should print World Hello
  */
object Ex05 extends App {
  args.reverse.foreach(println(_))
}