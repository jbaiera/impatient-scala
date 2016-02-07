package chapters.ch01

/**
  * What do the take, drop, takeRight, and dropRight string functions do? What
  * advantage or disadvantage do they have over using substring?
  */
object Ex10 extends App {

  val alphabet = "abcdefghijklmnopqrstuvwxyz"

  assert(alphabet.take(5) == "abcde")
  assert(alphabet.drop(5) == "fghijklmnopqrstuvwxyz")
  assert(alphabet.takeRight(5) == "vwxyz")
  assert(alphabet.dropRight(5) == "abcdefghijklmnopqrstu")

  // Advantage - Shooting from the hip relative to start and end
  // Alphabet has fewer than 100 characters, so it defaults to
  // grabbing the whole string.
  assert(alphabet.take(100) == alphabet)

}
