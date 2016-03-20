package chapters.ch10

/**
  * Chapter 10, Example 04:
  * Provide a CryptoLogger trait that encrypts the log messages with the Caesar
  * cipher. The key should be 3 by default, but it should be overridable by the
  * user. Provide usage examples with the default key and a key of -3.
  */
object Ex04 extends App {

  trait Logger {
    def log(message: String): Unit ={}
  }

  trait ConsoleLogger extends Logger {
    override def log(message: String): Unit = {
      println(message)
    }
  }

  trait CryptoLogger extends Logger {
    val key = 3
    override def log(message: String): Unit = {
      super.log(for (c <- message) yield (c.toInt + key).toChar)
    }
  }

  trait NegativeCrypto extends CryptoLogger {
    override val key = -3
  }

  class LoggedInformation extends Logger {
    def run(): Unit = {
      log("Hello World!")
    }
  }

  val info = new LoggedInformation with ConsoleLogger
  info.run()
  val caesar = new LoggedInformation with ConsoleLogger with CryptoLogger
  caesar.run()
  val negative = new LoggedInformation with ConsoleLogger with CryptoLogger with NegativeCrypto
  negative.run()
}
