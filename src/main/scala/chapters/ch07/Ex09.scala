package chapters.ch07

/**
  * Chapter 07, Example 09:
  * Write a program that imports the java.lang.System class, reads the user name
  * from the user.name system property, reads a password from the Console object,
  * and prints a message to the standard error stream if the password is not
  * "secret". Otherwise, print a greeting to the standard output stream. Do not use
  * any other imports, and do not use any qualified names (with dots).
  */
object Ex09 extends App {

  val username = System.getProperty("user.name")
  val console = System.console()
  val pass = new String(console.readPassword())

  if ("secret" == pass) println(s"Welcome, $username.") else System.err.println("Incorrect Password.")

}
