package chapters.ch08

/**
  * Chapter 08, Example 04:
  * Define an abstract class Item with methods price and description. A SimpleItem is
  * an item whose price and description are specified in the constructor. Take
  * advantage of the fact that a val can override a def. A Bundle is an item that
  * contains other items. Its price is the sum of the prices in the bundle. Also
  * provide a mechanism for adding items to the bundle and a suitable description
  * method.
  */
object Ex04 extends App {

  abstract class Item {
    def price: Double
    def description: String
  }

  class SimpleItem(val price: Double, val description: String) extends Item

  class Bundle(private var items: List[Item]) extends Item {
    def addItem(item: Item): Unit = items = item :: items
    override def price: Double = items.aggregate(0D)(_ + _.price, _ + _)
    override def description: String = "Bundle of " + items.mkString("(", ", ", ")")
  }

}
