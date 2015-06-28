lazy val `impatient-scala` = (project in file(".")).
  settings(
    name := "impatient-scala",
    version := "1.0",
    scalaVersion := "2.11.6",
    libraryDependencies += "junit" % "junit" % "4.12"
  )