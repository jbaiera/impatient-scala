package org.jbaiera.impatient.ch2.excercises

/**
 * Exercises from chapter 2
 */
object Exercises {

  // 1
  def signum(x:Int) = if (x > 0) 1 else if (x < 0) -1 else 0

  // 2
  def emptyBlock() = {} // IntelliJ recognizes this as a method of type Unit

  // 3
  def question3() = {
    var x : Unit = ()
    var y : Int = 0
    x = y = 1 // This is now valid
  }

  // 4
  def question4(): Unit = { // I can't help this, IntelliJ auto-prints it, and I kind of like that it does...
    for (idx <- (0 to 10).reverse) {
      println(idx)
    }
  }

  // 5
  def countdown(start : Int): Unit = {
    for(idx <- 0 to start by -1){ // Courtesy of Stack Overflow
      println(idx)
    }
  }

  // 6
  def stringProduct(str : String) = {
    var product = 1
    for (char <- str) {
      product = product * char.toInt
    }
    product
  }

  // 7
  def yieldStringProduct(str: String) = {
    (for (char <- str) yield char.toInt).product
  }

  // 8
  // This is already represented as functions, so I'll just skin the cat a few
  // different ways...
  def easyStringProduct(str: String): Int = str.map(_.toInt).product

  // 9
  def recStringProduct(str : String): Int = {
    if (str.isEmpty) 1 else str.head.toInt * recStringProduct(str.tail)
  }

  // 10
  def pow(x: Double, n: Int): Double = {
    if (n > 0 && n % 2 == 0) { val y = pow(x, n/2); y * y }
    else if (n>0) x * pow(x, n-1)
    else if (n == 0) 1
    else 1 / pow(x, -n)
  }
}
