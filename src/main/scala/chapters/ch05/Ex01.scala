package chapters.ch05

/**
  * Chapter 05, Example 01:
  * Improve the Counter class in Section 5.1, “Simple Classes and Parameterless
  * Methods,” on page 51 so that it doesn’t turn negative at Int.MaxValue.
  */
object Ex01 extends App {

  class Counter {
    private var value = 0

    def increment(): Unit = {
      if (value == Integer.MAX_VALUE)
        throw new IllegalStateException("Integer Overflow")
      else
        value += 1
    }

    def current() = value
  }

}
        