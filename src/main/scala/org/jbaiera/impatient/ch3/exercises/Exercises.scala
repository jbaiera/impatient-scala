package org.jbaiera.impatient.ch3.exercises

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

import scala.collection.{mutable, JavaConversions}
import scala.collection.mutable.ArrayBuffer
import scala.util.Random

/**
 * Exercises from chapter 3
 */
object Exercises {

  // 1
  def populateGarbage(n: Int) = {
    val buf = new ArrayBuffer[Int]()
    for (_ <- 0 until n) buf += (Random.nextInt() % n)
    buf.toArray
  }

  // 2
  def swapAdjacent(xs: Array[Int]): Unit = {
    for (idx <- xs.indices if (idx + 1) % 2 == 0 ) {
      val t = xs(idx)
      xs(idx) = xs(idx - 1)
      xs(idx - 1) = t
    }
  }

  // 3
  def swapAdjacentYield(xs: Array[Int]) = for (idx <- xs.indices) yield {
    if (idx % 2 == 1) xs(idx-1)
    else if (xs.length <= idx + 1) xs(idx)
    else xs(idx+1)
  }

  // I thought my answer to 3 looked a little lame. The following is a suggestion from stack overflow:
  def swapAdjacentStackOverflowAnswer(xs: Array[Int]) = xs.grouped(2).flatMap(_.reverse).toArray
  // That being said, this doesn't use yield - Oh, someone elses example answer:
  def anotherSwapFromSO(xs: Array[Int]) =
    for (i <- xs.indices by 2;
         j <- (i + 1) to i by -1
         if j < xs.length)
      yield xs(j)
  // each index 2 by 2, each index you land on, create a sequence that goes backward one, then filter
  // indices that are out of bounds
  // The concept of generating more loop variables and skipping other variables is something I
  // just need to get used to.

  // 4
  def positiveZeroNegativeSort(xs: Array[Int]) = xs.sortBy(Math.signum(_) * -1)

  // 5
  def averageValues(xs: Array[Double]) = xs.sum / xs.length

  // 6
  def reverseSort(xs: Array[Int]) = xs.sortWith(_ > _)
  def reverseSort(xs: ArrayBuffer[Int]) = xs.sortWith(_ > _)

  // 7
  def dedupe(xs: Array[Int]) = xs.distinct

  // 8
  def dropNegativesExceptFirst(xs: ArrayBuffer[Int]) = {
    val indexesToRemove = (for(idx <- xs.indices if xs(idx) < 0) yield idx).drop(1)
    for (idx <- indexesToRemove.indices.reverse; jdx = indexesToRemove(idx)) xs.remove(jdx)
  }

  // 9
  def americanTimestamps() = {
    (for (each <- java.util.TimeZone.getAvailableIDs if each.contains("America")) yield each.split('/')(1)).sorted
  }

  // 10
  def iHasAFlavor(): mutable.Buffer[String] = {
    import JavaConversions._
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    flavors.getNativesForFlavor(DataFlavor.imageFlavor)
  }
}
