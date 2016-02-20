package chapters.ch07

/**
  * Chapter 07, Example 02:
  * Write a puzzler that baffles your Scala friends, using a package com that isn’t
  * at the top level.
  */
object Ex02 extends App {

  println(
    """|By creating a package named "com" under the current package and adding a
       |broken class to it that would override an existing class in com, that would
       |allow you to confuse someone.
       |
       |I don't think I want to do all that package foo just for this example.
       |""".stripMargin)

}
