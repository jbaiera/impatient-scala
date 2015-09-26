package list

import list.LinkedList.Node

object LinkedList {
	private class Node(var data: Int, var next: Option[Node] = Option.empty) {}
}

class LinkedList private(private[this] var innerSize: Int, private var start: Option[Node] = Option.empty) extends Iterable[Int] {

	def this() {
		this(0)
	}

	def length = innerSize

	def add(value: Int): Unit = {
		if (start.isEmpty) {
			start = Option(new Node(value))
		} else {
			var next = start
			while (next.get.next.isDefined) next = next.get.next;
			next.get.next = Option(new Node(value))
		}
		innerSize+=1
	}

	def insertAt(value: Int, idx: Int): Unit = {
		if (idx > innerSize || idx < 0) {
			throw new RuntimeException("invalid index")
		} else {
			if (idx == 0) {
				start = Option(new Node(value, start))
			} else {
				var prev = start
				var current = start.get.next
				var count = 1
				while (current.isDefined && count != idx) {
					prev = current
					current = current.get.next
					count += 1
				}
				prev.get.next = Option(new Node(value, current))
			}
		}
	}

	def setAt(value: Int, idx: Int): Unit = {
		if (idx > innerSize || idx < 0) {
			throw new RuntimeException("invalid index")
		} else {
			if (idx == innerSize) {
				add(idx)
			} else {
				var current = start
				var count = 0
				while (current.isDefined && count != idx) {
					current = current.get.next
					count += 1
				}
				current.get.data = value
			}
		}
	}

	def +=(value: Int) = { add(value); this }
	def +=(xs: Iterable[Int]) = { for (i <- xs) add(i); this }
	def +=(xs: Int*): LinkedList = { this += xs }

	def apply(idx: Int): Int = {
		if (idx >= innerSize || idx < 0) {
			throw new RuntimeException("invalid index")
		} else {
			this.takeRight(innerSize-idx).head
		}
	}

	def remove(idx: Int): Unit = {
		if (idx >= innerSize || idx < 0) {
			throw new RuntimeException("invalid index " + idx)
		} else {
			var prev = Option.empty[Node]
			var current = start
			var count = 0
			while (current.isDefined && count != idx) {
				prev = current
				current = current.get.next
				count += 1
			}

			if (prev.isDefined) prev.get.next = current.get.next else start = current.get.next
		}
	}

	class LinkedIterator(private var current: Option[Node]) extends Iterator[Int] {
		override def hasNext: Boolean = current.isDefined
		override def next(): Int = { val r = current.get.data; current = current.get.next; r }
	}

	override def iterator: Iterator[Int] = new LinkedIterator(start)
}
