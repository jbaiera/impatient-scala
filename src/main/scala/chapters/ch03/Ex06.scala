package chapters.ch03

/**
  * How do you rearrange the elements of an Array[Int] so that they appear in
  * reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
  */
object Ex06 extends App {

  val a = Array(1, 2, 3, 4, 5)
  val b = a.toBuffer

  println(a.sortWith(_ > _).mkString(","))
  println(b.sortWith(_ > _).mkString(","))
}
