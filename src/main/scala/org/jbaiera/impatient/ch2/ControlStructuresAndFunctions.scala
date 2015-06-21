package org.jbaiera.impatient.ch2

/**
 * Chapter 2 - Control Structures and Functions
 */
class ControlStructuresAndFunctions {
  // ----------------------------------------------------------------
  // 2.1 If Statements
  // ----------------------------------------------------------------
  var x = 1
  val s = if (x > 0) 1 else -1

  val any = if (x > 0) "positive" else -1
  if (x > 0) 1
  if (x < 0) 1
  // ----------------------------------------------------------------
  // 2.2 MultiLine If Statements
  // ----------------------------------------------------------------
  val a = if (x > 0) { val r = s * x; r + 4 } else 1

  // ----------------------------------------------------------------
  // 2.3 Blocks
  // ----------------------------------------------------------------
  val b = { val g = a + 4; val f = a + 2; g - f }
  val unit = { var x = b; x -= 2}

  // ----------------------------------------------------------------
  // 2.4 Loops
  // ----------------------------------------------------------------
  // While
  var r = 1
  var n = 10
  while (n > 0) {
    r = r * n
    n -= 1
  }
  println(r)

  // For
  r = 1
  n = 10
  for (i <- 1 to n) {
    r = r * i
  }
  println(r)

  // For until range
  val str = "Hello"
  var sum = 0
  for (i <- 0 until str.length) {
    sum += str(i)
  }

  // For each
  sum = 0
  for (ch <- "Hello") sum += ch
  println(sum)

  // ----------------------------------------------------------------
  // 2.5 Advanced For Loops and For Comprehensions
  // ----------------------------------------------------------------
  // Multi
  for (i <- 1 to 3; j <- 1 to 3) print((10*i+j) + " ")

  // Guards
  for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10*i+j) + " ")

  // Any number of definitions
  for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")

  // Yield / For Comprehensions
  for (i <- 1 to 10) yield i % 3
  // returned container is same as the first generator ("Hello" is a string)
  // yield expects values of the same type as the iterator (c is a char)
  for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar

  for {
    i <- 1 to 3
    from = 4 - i
    j <- from to 3
  } {
    print((10 * i + j) + " ")
  }

  // ----------------------------------------------------------------
  // 2.6 Functions
  // ----------------------------------------------------------------
  def abs(x: Double) = if (x >= 0) x else -x

  def fac(n: Int) = {
    var r = 1
    for (i <- 1 to n) r = r * i
    r
  }

  // Recursive requires the return type
  def facrec(n: Int): Int = if (n <= 0) 1 else n * facrec(n - 1)

  fac(4)
  facrec(4)

  // ----------------------------------------------------------------
  // 2.7 Default and Named Arguments
  // ----------------------------------------------------------------

  def decorate(str: String, left: String = "[", right: String = "]") = {
    left + str + right
  }

  decorate("HI") // all defaults
  decorate("Hello", ">>>[") // right is defaulted
  decorate("HI", "<", ">") // all specified
  decorate(left = "<<<", str = "HEYO", right = ">>>") // unordered arg=value
  decorate("Hello", right = "]$ ") // mixed order, unnamed and named

  // ----------------------------------------------------------------
  // 2.8 Variable Arguments
  // ----------------------------------------------------------------
  def sum(args: Int*) = {
    var result = 0
    for (i <- args) {
      result += i
    }
    result
  }

  var sumValue = sum(1, 4, 9, 16, 25)
  sumValue = sum(1 to 5: _*) // Compiler : Consider 1 to 5 as an argument Seq.
  // Helpful for recursive definitions

  def sumrecursive(args: Int*): Int = if (args.isEmpty) 0 else args.head + sum(args.tail: _*)

  // ----------------------------------------------------------------
  // 2.9 Procedures
  // ----------------------------------------------------------------
  // Functions without equals sign - return type of Unit, called procedures
  def box(s: String) {
    // No = sign (IntelliJ tries to complete the Unit type for you though)
    val border = "-" * s.length + "--\n"
    println(border + "|" + s + "|\n" + border)
  }

  box("Hello There")

  // ----------------------------------------------------------------
  // 2.10 Lazy Values
  // ----------------------------------------------------------------
  // lazy values are initialized on first use.
  lazy val words = "asdfgasdfasdfasdfasdfasdfasdfasdf".length

  // Lazy are between val and def
  // - val evaluates immediately and once
  // - lazy * evaluates once and only right before it's used
  // - def evaluates every time the variable is used

  // ----------------------------------------------------------------
  // 2.11 Exceptions
  // ----------------------------------------------------------------


}
