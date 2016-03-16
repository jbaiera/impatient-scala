package chapters.ch09

import java.io.File

/**
  * Chapter 09, Example 09:
  * Write a Scala program that counts how many files with .class extension are
  * in a given directory and its subdirectories.
  */
object Ex09 extends App {

  def subdirs(file: File): Iterator[File] = {
    val children = file.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs)
  }

  val startingFile = new File(".")
  val allFiles = Seq(startingFile) ++ subdirs(startingFile)

  val classcount = allFiles.flatMap(_.listFiles.filter((f) => f.isFile)).count(_.getName.endsWith(".class"))

  println(classcount)
}
