package chapters.ch09

import java.io._

import scala.collection.mutable.ArrayBuffer

/**
  * Chapter 09, Example 10:
  * Expand the example with the serializable Person class that stores a collection
  * of friends. Construct a few Person objects, make some of them friends of
  * another, and then save an Array[Person] to a file. Read the array back in and
  * verify that the friend relations are intact.
  */
object Ex10 extends App {

  @SerialVersionUID(42L) class Person(val name: String) extends Serializable {
    private var friends: List[String] = Nil

    def <+(person: Person): Person = {
      addFriend(person)
      this
    }

    def addFriend(person: Person): Unit = {
      friends = person.name :: friends
    }

    def isFriendsWith(person: Person): Boolean = {
      friends.contains(person.name)
    }

    def canEqual(other: Any): Boolean = other.isInstanceOf[Person]

    override def equals(other: Any): Boolean = other match {
      case that: Person =>
        (that canEqual this) &&
          friends == that.friends &&
          name == that.name
      case _ => false
    }

    override def hashCode(): Int = {
      val state = Seq(friends, name)
      state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
    }


    override def toString = s"Person($friends, $name)"
  }

  val jimmy = new Person("Jimmy")
  val chris = new Person("Chris")
  val andy = new Person("Andy")
  val rob = new Person("Rob")
  val mark = new Person("Mark")

  jimmy <+ chris <+ andy <+ rob <+ mark
  chris <+ jimmy <+ andy <+ mark
  andy <+ jimmy <+ chris
  rob <+ jimmy <+ mark
  mark <+ jimmy <+ chris <+ rob

  val people = Array(jimmy, chris, andy, rob, mark)

  val out = new ObjectOutputStream(new FileOutputStream("out/people.dat"))
  out.writeObject(people)
  out.close()

  val in = new ObjectInputStream(new FileInputStream("out/people.dat"))
  val savedPeople = in.readObject().asInstanceOf[Array[Person]]
  in.close()

  assert(savedPeople(0).name == jimmy.name)
  assert(savedPeople(0) isFriendsWith chris)
  assert(savedPeople(0) isFriendsWith andy)
  assert(savedPeople(0) isFriendsWith rob)
  assert(savedPeople(0) isFriendsWith mark)

  assert(savedPeople(1).name == chris.name)
  assert(savedPeople(1) isFriendsWith jimmy)
  assert(savedPeople(1) isFriendsWith andy)
  assert(savedPeople(1) isFriendsWith mark)

  assert(savedPeople(2).name == andy.name)
  assert(savedPeople(2) isFriendsWith jimmy)
  assert(savedPeople(2) isFriendsWith chris)

  assert(savedPeople(3).name == rob.name)
  assert(savedPeople(3) isFriendsWith jimmy)
  assert(savedPeople(3) isFriendsWith mark)

  assert(savedPeople(4).name == mark.name)
  assert(savedPeople(4) isFriendsWith jimmy)
  assert(savedPeople(4) isFriendsWith chris)
  assert(savedPeople(4) isFriendsWith rob)

}
