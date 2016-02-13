package chapters.ch02

/**
  * Write a function that computes x^n, where n is an integer. Use the following recursive definition:
  * • x^n = y^2 if n is even and positive, where y = x^n / 2.
  * • x^n = x · x^n – 1 if n is odd and positive.
  * • x^0 = 1.
  * • x^n = 1 / x –n if n is negative.
  * Don’t use a return statement.
  */
object Ex10 extends App {

  def pow(x: Double, n: Int): Double = {
    if (n > 0 && n % 2 == 0) { val y = pow(x, n/2); y * y }
    else if (n>0) x * pow(x, n-1)
    else if (n == 0) 1
    else 1 / pow(x, -n)
  }

  println(pow(3, 2))

}
