package org.jbaiera.impatient.ch3.exercises

import org.scalatest.FunSuite
import Exercises._

/**
  * No better time to start mucking with Scala test than now
 * Chapter 3 exercise tests
 */
class Exercises$Test extends FunSuite {
  test("Problem 1") {
    assert(populateGarbage(10).length == 10)
  }

  test("Problem 2") {
    val xs = Array(1,2,3)
    swapAdjacent(xs)
    assert(xs sameElements Array(2, 1, 3))
  }

  test("Problem 3") {
    val xs = swapAdjacentYield(Array(1, 2, 3)).toArray
    assert(xs sameElements Array(2, 1, 3))

    assert(swapAdjacentStackOverflowAnswer(Array(1, 2, 3)) sameElements Array(2, 1, 3))
    assert(anotherSwapFromSO(Array(1, 2, 3)).toArray sameElements Array(2, 1, 3))
  }

  test("Problem 4") {
    assert(positiveZeroNegativeSort(Array(4, -8, 2, 0, -3)) sameElements Array(4, 2, 0, -8, -3))
  }

  test("Problem 5") {
    assertResult(10)(averageValues(Array(12, 12, 12, 8, 8, 8)))
  }

  test("Problem 6") {
    assertResult(Array(4,3,2,1))(reverseSort(Array(3,2,4,1)))
  }

  test("Problem 7") {
    assertResult(Array())
  }
}
