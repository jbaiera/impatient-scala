package chapters.ch05

/**
  * Chapter 05, Example 04:
  * Reimplement the Time class from the preceding exercise so that the internal
  * representation is the number of minutes since midnight (between 0 and
  * 24 × 60 – 1). Do not change the public interface. That is, client code should be
  * unaffected by your change.
  */
object Ex04 extends App {

  class Time(h: Int, m: Int) {
    if (h < 0 || h > 23) throw new IllegalArgumentException("Invalid Hour value")
    if (m < 0 || m > 59) throw new IllegalArgumentException("Invalid Minute value")

    private val minutesSinceMidnight = (h * 60) + m

    def hours: Int = minutesSinceMidnight / 60
    def minutes: Int = minutesSinceMidnight % 60
    def before(other: Time): Boolean = minutesSinceMidnight < other.minutesSinceMidnight
  }

}
        