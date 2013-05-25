name := "Fizzbuzz"

version := "1.0"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"

// libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test->default"

// libraryDependencies ++= Seq("org.specs2" %% "specs2" % "1.14" % "test")

resolvers ++= Seq(
  "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.10.1" % "test"
)
