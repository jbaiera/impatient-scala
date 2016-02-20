package chapters.ch06

/**
  * Chapter 06, Example 02:
  * The preceding problem wasn’t very object-oriented. Provide a general superclass
  * UnitConversion and define objects InchesToCentimeters, GallonsToLiters, and
  * MilesToKilometers that extend it.
  */
object Ex02 extends App {

  abstract class UnitConversion {
    def convert(input: Double): Double
  }

  object InchesToCentimeters extends UnitConversion {
    override def convert(input: Double): Double = input * 2.54
  }

  object GallonsToLiters extends UnitConversion {
    override def convert(input: Double): Double = input * 3.78541
  }

  object MilesToKilometers extends UnitConversion {
    override def convert(input: Double): Double = input * 1.60934
  }

}
