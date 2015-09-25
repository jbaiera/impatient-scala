object LinkedList {
	class Node(var data: Int, var next: Node) {}
}

class LinkedList private(var size: Int, private var start: Option[LinkedList.Node] = Option.empty) {
	
	private[this] class Node(var data: Int, var next: Node) {}
	
	def this() {
		this(0)
	}
	
}
