package chapters.ch08

/**
  * Chapter 08, Example 08:
  * Compile the Person and SecretAgent classes in Section 8.6, “Overriding Fields,”
  * on page 91 and analyze the class files with javap. How many name fields are
  * there? How many name getter methods are there? What do they get? (Hint:
  * Use the -c and -private options.)
  */
object Ex08 extends App {
  println(
    """Answer:
      |
      |Person has a single private final field "name" and a single getter "name()"
      |
      |SecretAgent has a single private final field "name" and a single getter "name()"
      |
      |An interesting thing found though is that SecretAgent has a "toString" method that
      |returns a field called "toString"
      |""".stripMargin)
}

class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}

class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret"
  override val toString = "secret"
}