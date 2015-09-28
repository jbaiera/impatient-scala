package org.jbaiera.impatient.ch3

import scala.collection.mutable

/**
 * Chapter 3 - Working With Arrays
 */
class WorkingWithArrays {

  // ----------------------------------------------------------------
  // 3.1 Fixed Size Arrays
  // ----------------------------------------------------------------
  val constructor = new Array[String](10)
  val apply = Array("Hello", "World")
  println("apply(0) = " + apply(0)) // array access with () instead of []

  // ----------------------------------------------------------------
  // 3.2 Variable Size Arrays
  // ----------------------------------------------------------------
  import collection.mutable.ArrayBuffer
  val buffer = new ArrayBuffer[Int]()
  buffer += 1 // append value
  // ( 1 )
  buffer += (1, 2, 3, 5) // append tuples of values
  // ( 1, 1, 2, 3, 5 )
  buffer ++= Array(8, 11, 17) // append arrays
  // ( 1, 1, 2, 3, 5, 8, 11, 17)
  buffer.trimEnd(2) // drop last two
  // ( 1, 1, 2, 3, 5, 8 )

  // as per usual, delete/add ops on end are efficient,
  // but not in the middle of the buffer.

  buffer.insert(2, 6) // insert before current index 2
  buffer.insert(2, 7, 8, 9) // insert multiple values before idx 2
  buffer.remove(2) // remove element at idx 2
  buffer.remove(2, 3) // how many elements to remove at and after idx 2

  val built = buffer.toArray // build into an immutable array
  val bufferAgain = built.toBuffer // convert back to buffer

  // ----------------------------------------------------------------
  // 3.3 Traversing Arrays
  // ----------------------------------------------------------------
  val array = Array(1,2,3,4,5,6,7,8,9,10)
  // for loops
  for (i <- array.indices) println(i + ":" + array(i))
  // originally 0 until array.length, IDEA suggests using indices method

  // every other
  for (i <- array.indices by 2) println(i + ":" + array(i))

  // reverse
  for (i <- array.indices.reverse) println(i + ":" + array(i))

  // normally don't need the index though so...
  for (i <- array) println(i)

  // ----------------------------------------------------------------
  // 3.4 Transforming Arrays
  // ----------------------------------------------------------------
  val before = Array(2, 3, 5, 7, 11)
  val result = for (elem <- before) yield 2 * elem

  // for (...) yield creates new collection of same type of the first used collection
  // use guards to predicate your starting values

  val evensOnly = for (elem <- before if elem % 2 == 0) yield elem
  val doubleEvens = for (elem <- before if elem % 2 == 0) yield elem * 2

  // Example - sequence of Ints, remove all negatives except for the first negative number
  // Best to bunch up all the affected values at once and remove them starting from the back

  val someValues = Array(1, 3, -5, 4, 8, -3, -5, 2, 5, -4, 1).toBuffer
  val indexesToRemove = for(idx <- someValues.indices if someValues(idx) < 0) yield idx
  for (j <- (1 until indexesToRemove.size).reverse) someValues.remove(indexesToRemove(j))

  // ----------------------------------------------------------------
  // 3.5 Common Algorithms
  // ----------------------------------------------------------------
  Array(1,7,2,9).sum //19
  ArrayBuffer("Mary", "had", "a", "little", "lamb").max // "little"

  val someSortedValues = someValues.sortWith(_ < _) // original is unchanged

  // Arrays can sort in place, ArrayBuffers cannot.
  util.Sorting.quickSort(Array(5,4,3,2,1))

  // Sorting depends on contents having the Ordered Trait

  // concat separators ala Guava style?
  someSortedValues.mkString(", ")
  someSortedValues.mkString(", ", "<", ">") // w/ prefix and suffix

  // ----------------------------------------------------------------
  // 3.6 Scaladocs
  // ----------------------------------------------------------------
  // Read them, idk.

  // ----------------------------------------------------------------
  // 3.7 Multi-Dimensional Arrays
  // ----------------------------------------------------------------
  val matrix = Array.ofDim[Double](3, 4)
  matrix(1)(2) = 42

  // ----------------------------------------------------------------
  // 3.8 Interop w/ Java
  // ----------------------------------------------------------------
  import com.google.common.collect._
  import collection.JavaConversions._

  val stringBuffer = ArrayBuffer("Hello", "World", "Weeee")
  val reverseStringList = Lists.reverse(stringBuffer) // MAGIC BUFFER TO LIST HAPPENS (scala to java)
  val anotherBuffer: mutable.Buffer[String] = Lists.reverse(reverseStringList) // MAGIC LIST RETURN TO BUFFER HAPPENS (java to scala)

}
