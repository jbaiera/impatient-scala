package org.jbaiera.impatient.ch1

/**
 * Chapter 1 - The Basics
 */
class Basics {
  // ----------------------------------------------------------------
  // 1.1 Interpreter
  // ----------------------------------------------------------------
  val a = 8 * 5 + 2
  0.5 * a
  val b = "Hello, " + a
  b.toUpperCase
  b.toLowerCase

  // ----------------------------------------------------------------
  // 1.2 Declaring variables
  // ----------------------------------------------------------------
  var counter = 0
  counter = 1
  val greeting: String = null
  val something: Any = "Hello"

  val xmax, ymax = 100

  // ----------------------------------------------------------------
  // 1.3 Commonly Used Types
  // ----------------------------------------------------------------
  println(1.toString)
  1.to(10)
  "Hello".intersect("World")

  // ----------------------------------------------------------------
  // 1.4 Arithmetic and Operator Overloading
  // ----------------------------------------------------------------
  val answer = 8 * 5 + 2
  answer + a
  answer.+(a)
  1 to 10
  counter+=1
  val x: BigInt = 1234567890
  x * x * x

  // ----------------------------------------------------------------
  // 1.5 Calling Functions and Methods
  // ----------------------------------------------------------------
  import scala.math._
  sqrt(2)
  pow(2, 4)
  min(3, Pi)
  BigInt.probablePrime(100, scala.util.Random)
  "Hello".distinct

  // ----------------------------------------------------------------
  // 1.6 The apply Method
  // ----------------------------------------------------------------
  "Hello"(4)
  "Hello".apply(4)
  BigInt("1234567890")
  BigInt.apply("1234567890")
  BigInt("1234567890") + BigInt("112358111321")
}
