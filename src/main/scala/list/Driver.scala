package list

object Driver extends App {

  def out(xs: Iterable[_]): Unit = {
    println(xs.mkString(","))
  }

	//Create list
  var list = new LinkedList()

	//Add x elements
  list += 5 to (100, 5)

  out(list)

  val f = (x: Int) => x * 2
  
  out(list.map(f))
  out(list.map((x: Int) => x * 3))

}
