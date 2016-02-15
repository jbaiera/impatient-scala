package chapters.ch03

/**
  * Rewrite the example at the end of Section 3.4, “Transforming Arrays,” on
  * page 34 using the drop method for dropping the index of the first match. Look
  * the method up in Scaladoc.
  */
object Ex08 {

  val xs = Array(1, -1, 2, -2, 3, -3, 4).toBuffer

  val indexesToRemove = (for (idx <- xs.indices if xs(idx) < 0) yield idx).drop(1)
  for (idx <- indexesToRemove.reverse) xs.remove(idx) // remove from tail
}
