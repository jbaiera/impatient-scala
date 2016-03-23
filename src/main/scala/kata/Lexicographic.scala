package kata

import scala.annotation.tailrec

object Lexicographic extends App {

  implicit def lexicographical = new Ordering[String] {
    @tailrec def compare(x: String, y: String): Int = x -> y match {
      case ("", "") => 0
      case ("", b) if b.length > 0 => -1
      case (a, "") if a.length > 0 => 1
      case (a, b) if a(0) == b(0) => this.compare(a.tail, b.tail)
      case (a, b) => a(0).compareTo(b(0))
    }
  }

  assert(lexicographical.lt("ha", "hi"))
  assert(lexicographical.gt("hi", "ha"))
  assert(lexicographical.equiv("ha", "ha"))
  assert(lexicographical.lt("ha", "hal"))

}
