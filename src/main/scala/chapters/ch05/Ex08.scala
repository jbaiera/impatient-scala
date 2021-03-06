package chapters.ch05

/**
  * Chapter 05, Example 08:
  * Make a class Car with read-only properties for manufacturer, model name,
  * and model year, and a read-write property for the license plate. Supply four
  * constructors. All require the manufacturer and model name. Optionally,
  * model year and license plate can also be specified in the constructor. If not,
  * the model year is set to -1 and the license plate to the empty string. Which
  * constructor are you choosing as the primary constructor? Why?
  */
object Ex08 extends App {
  class Car(val manufacturer: String, val modelName: String, val modelYear: Int = -1, var licensePlate: String = "") {

    def this(manufacturer: String, modelName: String, license: String) = {
      this(manufacturer, modelName, licensePlate=license)
    }

  }

  val c = new Car("Ford", "Taurus", "2HOT")
}
        