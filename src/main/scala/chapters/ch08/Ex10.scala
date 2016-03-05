package chapters.ch08

/**
  * Chapter 08, Example 10:
  * The file scala/collection/immutable/Stack.scala contains the definition
  *
  *   class Stack[A] protected (protected val elems: List[A])
  *
  * Explain the meanings of the protected keywords. (Hint: Review the discussion
  * of private constructors in Chapter 5.)
  */
object Ex10 extends App {

  println(
    """|Constructors can take a modifier like 'private' as a qualifier for
       |what scope the constructor may be accessed from. The 'protected'
       |keyword is used to grant access to a field or method only to
       |a scope that belongs to a subclass of the owner of the field or method.
    """.stripMargin)

}
