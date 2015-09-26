package list

object Driver extends App {

	def addByX(x: Int): (Int) => Int = _ + x
	val addOne = addByX(1)
	def runTwice(f: (Int) => Int): (Int) => Int = in => f(f(in))
		
	println("1 through 6")
	var list = LinkedList()
	list = list += 1 += 2 += 3 += 4 += 5 += 6
	println(list)

	println("empty list")
	var emptyList = new LinkedList()
	println(emptyList)

	println("multiplied")
	val multiplyByTwo = (i: Int) => { i * 2 }
	var multiplied = list.map(multiplyByTwo)
	println(multiplied)
	
	println("add one")
	var added = list.map(addOne)
	println(added)

	println("add one and multiply")
	var addedAndMultiplied = list.map(addOne).map(multiplyByTwo)
	println(addedAndMultiplied)

	println("add by x=10")
	var addByXEqualsTen = list.map(addByX(10))
	println(addByXEqualsTen)

	println("add twice")
	var addTwice = list.map(runTwice(addByX(1)))
	println(addTwice)

	println("group by even")
	var groupByEven = list.groupBy(_ % 2 == 0)
	println(groupByEven)

	println("Reduce")
	//var reduce = list.reduce((in1, in2) => in1 * in2)
	var reduce = list.reduce(_ * _)
	println(reduce)

	println("Curry")
	val curry = (x: Int) => (y: Int) => x * y
	val curry2 = curry(2)
	val curry24 = curry2(4)
	println(curry24)	
	
	println("Hot Curry")
	def hotCurry(x: Int)(y: Int)(z: Int) = x * y + z
	val hotCurry2 = hotCurry(2)(_)
	val hotCurry24 = hotCurry2(4)(_)
	val hotCurry243 = hotCurry24(3)
	println(hotCurry243)
}
