package chapters.ch10

import java.io.{InputStream, ByteArrayInputStream => JByteArrayInputStream}

/**
  * Chapter 10, Example 08:
  * In the java.io library, you add buffering to an input stream with a
  * BufferedInputStream decorator. Reimplement the buffering as a trait. For simplicity,
  * override the read method.
  */
object Ex08 extends App {

  trait Buffered {
    this: InputStream =>
    var head = 0
    var tail = 0
    var eos = false
    val buff = new Array[Byte](4086)
    def fill(): Unit = {
      if (!eos) {
        val r = read(buff)
        tail = 0
        head = tail + r
        eos = r < buff.length
      }
    }
    override def read(): Int = {
      if (eos && tail == head) -1
      else {
        if (tail == head) {
          fill()
        }
        val v = buff(tail)
        tail += 1
        v
      }
    }
  }

  val bin = new JByteArrayInputStream("Hello World!".getBytes()) with Buffered
  println(bin.read().toChar)
  println(bin.read().toChar)
  println(bin.read().toChar)
  println(bin.read().toChar)
  println(bin.read().toChar)
  println(bin.read().toChar)
  println(bin.read().toChar)
  println(bin.read().toChar)
  println(bin.read().toChar)
  println(bin.read().toChar)
  println(bin.read().toChar)
  println(bin.read().toChar)
  println(bin.read()) // EOF
  println(bin.read()) // EOF
  println(bin.read()) // EOF
  println(bin.read()) // EOF

}
