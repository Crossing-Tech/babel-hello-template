name := "hello-babel"

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "io.xtech.babel" %% "babel-camel-core" % "0.6.0",
  "io.xtech.babel" %% "babel-camel-mock" % "0.6.0",
  "org.slf4j" % "slf4j-log4j12" % "1.7.3",
  "junit" % "junit" % "4.11" % "test",
  "org.specs2" %% "specs2" % "2.4.1" % "test"
)
