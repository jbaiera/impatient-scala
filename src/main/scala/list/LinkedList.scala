package list

import list.LinkedList.Node
import list.LinkedList.LinkedIterator

object LinkedList {
	class Node(var data: Int, var next: Option[Node] = Option.empty) {}
	class LinkedIterator(var node: Option[Node]) extends Iterator[Int] {
		override def hasNext(): Boolean = {
			node.isDefined
		}
		override def next(): Int = {
			val r = node.get.data
			node = node.get.next
			r
		}
	}
	
	def apply(): LinkedList = {
		new LinkedList()
	}
}

class LinkedList private(private var innerSize: Int, private var start: Option[Node] = Option.empty, private var end: Option[Node] = Option.empty) extends Iterable[Int] {
	
	def this() {
		this(0)
	}
	
	def length = size

	def add(value: Int): Unit = {
		if (start.isEmpty) {
			start = Option(new Node(value))
			end = start
		}
		else {
			var oldEnd = end
			end = Option(new Node(value))
			oldEnd.get.next = end
		}
		innerSize += 1
	}

	def +=(values: Iterable[Int]): LinkedList = {
		for (i <- values) add(i)
		this
	}
	
	def +=(values: Int*): LinkedList = {
		this += values
	}

	def apply(index: Int): Int = {
		if (index < 0 || index >= innerSize) {
			throw new RuntimeException("Bad Index " + index);
		}
		take(index).last
	}

	override def iterator(): LinkedIterator = new LinkedIterator(start)
}
