package chapters.ch04

/**
  * What happens when you zip together two strings, such as "Hello".zip("World")?
  * Come up with a plausible use case.
  */
object Ex10 extends App {

  var zipped = "Hello".zip("World")

  // we can write the words vertically now, I guess...
  for ((first, next) <- zipped) println(first+" "+next)

  // basically you could use this to pivot two lines
}
