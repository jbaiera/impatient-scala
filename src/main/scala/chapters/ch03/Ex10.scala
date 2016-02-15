package chapters.ch03

import scala.collection.mutable

/**
  * Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with
  * the call
  *
  *     val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  *
  * Then call the getNativesForFlavor method with parameter DataFlavor.imageFlavor
  * and get the return value as a Scala buffer. (Why this obscure class? It’s hard
  * to find uses of java.util.List in the standard Java library.)
  */
object Ex10 {

  import java.awt.datatransfer._
  val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]

  import collection.JavaConversions._
  val imageFlavors: mutable.Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
}
