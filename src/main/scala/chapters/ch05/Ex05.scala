package chapters.ch05

/**
  * Chapter 05, Example 05:
  * Make a class Student with read-write JavaBeans properties name (of type String)
  * and id (of type Long). What methods are generated? (Use javap to check.) Can
  * you call the JavaBeans getters and setters in Scala? Should you?
  */
object Ex05 extends App {

  import scala.beans.BeanProperty

  class Student(@BeanProperty var name: String, @BeanProperty var id: Long)

  val student = new Student("Jimmy", 12345)

  // name() method
  student.name
  // name_$eq(String) method
  student.name = "Jimmy the Hat"
  // getName() method
  student.getName
  // setName(String) method
  student.setName("James Baiera")

  // Can you call javabeans methods in scala? Yes. Duh.
  // Should you call them? Nah. The property names are better to depend on.
}
        