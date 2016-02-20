package chapters.ch06

/**
  * Chapter 06, Example 01:
  * Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and
  * milesToKilometers.
  */
object Ex01 extends App {

  object Conversions {
    def inchesToCentimeters(inches: Double): Double = {
      inches * 2.54
    }

    def gallonsToLiters(gallons: Double): Double = {
      gallons * 3.78541
    }

    def milesToKilometers(miles: Double): Double = {
      miles * 1.60934
    }
  }
}
