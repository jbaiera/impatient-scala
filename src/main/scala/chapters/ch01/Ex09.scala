package chapters.ch01

/**
  * How do you get the first character of a string in Scala? The last character?
  */
object Ex09 extends App {



  assert("abcdefg"(0) == 'a')
  assert("abcdefg"("abcdefg".length-1) == 'g')

  assert("abcdefg".head == 'a')
  assert("abcdefg".last == 'g')

}
