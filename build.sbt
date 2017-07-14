name := "zobot"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= {
  val akkaV = "2.4.16"

  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV
  )
}