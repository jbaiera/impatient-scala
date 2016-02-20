package chapters.ch06

/**
  * Chapter 06, Example 08:
  * Write an enumeration describing the eight corners of the RGB color cube. As
  * IDs, use the color values (for example, 0xff0000 for Red).
  */
object Ex08 extends App {

  object ColorCube extends Enumeration {
    private [this] val levels = Seq("00", "ff")
    for (red <- levels; green <- levels; blue <- levels) {
      Value(s"0x$red$green$blue")
    }
  }

  println(ColorCube.withName("0xff0000"))

}
