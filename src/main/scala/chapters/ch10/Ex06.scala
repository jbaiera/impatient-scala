package chapters.ch10

/**
  * Chapter 10, Example 06:
  * In the Java AWT library, we have a class Container, a subclass of Component that
  * collects multiple components. For example, a Button is a component, but a Panel
  * is a Container. That's the composite pattern at work. Swing has JComponent and
  * JButton, but if you look closely, you will notices something strange. JComponent
  * extends Container, even though it makes no sense to add other components to,
  * say, a JButton. The Swing designers would have ideally preferred the design
  * in (the following figure).
  * <pre>
  *   Component &lt;---------+
  *       &#94;               |
  *       |           Container
  *       |               &#94;
  *   JComponent &lt;--------+
  *       &#94;               |
  *       |           JContainer
  *       |               &#94;
  *   JButton             |
  *                       |
  *                     JPanel
  * </pre>
  * But that's not possible in Java. Explain why not. How could the design be
  * executed in Scala with traits?
  */
object Ex06 extends App {

}
