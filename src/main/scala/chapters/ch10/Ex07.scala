package chapters.ch10

/**
  * Chapter 10, Example 07:
  * There are dozens of Scala trait tutorials with silly examples of barking dogs
  * or philosophizing frogs. Reading through contrived hierarchies can be
  * tedious and not very helpful, but designing your own is very illuminating.
  * Make your own silly trait hierarchy example that demonstrates layered
  * traits, concrete and abstract methods, and concrete and abstract fields.
  */
object Ex07 extends App {

  abstract class Animal(val name: String) {
    def doWhatYouDo()
  }

  trait MakesNoise {
    val name: String
    def noiseYouMake: String

    def makeNoise() { println(name + " goes " + noiseYouMake) }
  }

  trait Quacks extends MakesNoise {
    override def noiseYouMake = "QUACK!"
  }

  trait Barks extends MakesNoise {
    override def noiseYouMake = "BARK!"
  }

  trait isSilent extends MakesNoise {
    override def noiseYouMake = "..."
    override def makeNoise() { println(name + "s don't make a sound!") }
  }

  trait Quietly extends MakesNoise {
    abstract override def noiseYouMake = super.noiseYouMake + "... stealthily..."
  }

  trait LikesTo {
    val name: String
    def enjoys: String
    def does: String
    def likesTo() = println(s"$name enjoys $enjoys")
    def doWhatYouDo() = println(s"$name $does")
  }

  trait LikesToRun extends LikesTo {
    def enjoys = "Running"
    def does = "Runs"
  }

  trait LikesToFly extends LikesTo {
    def enjoys = "Flying"
    def does = "Flies"
  }

  trait LikesToStalkHisFoesInTheDarkness extends LikesTo {
    def enjoys = "Striking from the shadows with deadly precision"
    def does = "Attacks"
  }

  val dog = new Animal("Dog") with Barks with LikesToRun
  dog.makeNoise()
  dog.likesTo()
  dog.doWhatYouDo()
  println()

  val duck = new Animal("Duck") with Quacks with LikesToFly
  duck.makeNoise()
  duck.likesTo()
  duck.doWhatYouDo()
  println()

  val ninja = new Animal("Ninja") with isSilent with LikesToStalkHisFoesInTheDarkness
  ninja.makeNoise()
  ninja.likesTo()
  ninja.doWhatYouDo()
  println()

  val ninjaDuck = new Animal("Ninja Duck") with Quacks with Quietly with LikesToStalkHisFoesInTheDarkness
  ninjaDuck.makeNoise()
  ninjaDuck.likesTo()
  ninjaDuck.doWhatYouDo()
  println()
}
