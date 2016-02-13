package chapters.ch02

/**
  * Make the function of the preceding exercise a recursive function.
  */
object Ex09 extends App {

  def product(s: String): Int = {
    if (s.length == 1) s.head.toInt else s.head.toInt * product(s.tail)
  }

  assert(825152896 == product("Hello"))

}
