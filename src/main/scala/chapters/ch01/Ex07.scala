package chapters.ch01

/**
  * What do you need to import so that you can get a random prime as
  * probablePrime(100, Random), without any qualifiers before probablePrime and Random?
  */
object Ex07 extends App {

  import scala.math.BigInt.probablePrime
  import scala.util.Random

  println(probablePrime(100, Random))
}
