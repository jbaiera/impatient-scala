package chapters.ch05;

/**
  * Chapter 05, Example 09:
  * Reimplement the class of the preceding exercise in Java, C#, or C++ (your
  * choice). How much shorter is the Scala class?
  */
public class Ex09 {

	public static class Person {

		private final String fullname;

		public Person(String fullname) {
			this.fullname = fullname;
		}

		public String firstName() {
			return fullname.split(" ")[0];
		}

		public String lastName() {
			return fullname.split(" ")[1];
		}
	}

	// Scala is a whole lot shorter. We get it, Cay.
}
