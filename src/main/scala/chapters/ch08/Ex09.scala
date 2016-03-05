package chapters.ch08

/**
  * Chapter 08, Example 09:
  * In the Creature class of Section 8.10, “Construction Order and Early Definitions,”
  * on page 94, replace val range with a def. What happens when you also use a
  * def in the Ant subclass? What happens when you use a val in the subclass?
  * Why?
  */
object Ex09 extends App {
  val originalAnt = new original.Ant
  val defAnt = new bothDef.Ant
  val valAnt = new defAndVal.Ant

  /*
   * Set to zero because Creature calls range() which is a getter on Ant, a getter that refers to an
   * uninitialized field. When the getter is executed, it returns the default value of an uninitialized Int, zero.
   */
  assert(originalAnt.env.length == 0)

  /*
   * Set to 2 because Creature calls range() which is a function that simply returns the constant 2. There is no
   * internal field created that may be uninitialized. This is different because there is no field to be initialized.
   * The function just returns a constant.
   */
  assert(defAnt.env.length == 2)

  /*
   * Set to 0 because Creature calls the range() function, which is overridden by the Ant class with a getter method
   * that points to an uninitialized field. This is similar to case 1, in that there is a field on the subclass
   * that is returned before initialization.
   */
  assert(valAnt.env.length == 0)

}

package original {
  class Creature {
    val range: Int = 10 // <- Both a getter method and a private final field.
    val env: Array[Int] = new Array[Int](range) // <- calls range() on Ant, which returns uninitialized field.
  }

  class Ant extends Creature {
    override val range = 2 // <- Both a getter method and a private final field.
  }
}

package bothDef {
  class Creature {
    def range: Int = 10 // <- Simply a method that returns a constant value.
    val env: Array[Int] = new Array[Int](range) // <- calls range() on Ant, which returns the constant "2"
  }

  class Ant extends Creature {
    override def range = 2 // <- Simply a method that returns a constant value.
  }
}

package defAndVal {
  class Creature {
    def range: Int = 10 // <- Simply a method that returns a constant value.
    val env: Array[Int] = new Array[Int](range) // <- calls range() on Ant, which returns uninitialized field.
  }

  class Ant extends Creature {
    override val range = 2 // <- Both a getter method and a private final field.
  }
}