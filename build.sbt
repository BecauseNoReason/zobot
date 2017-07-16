import com.trueaccord.scalapb.compiler.Version.scalapbVersion

name := "zobot"
version := "1.0"
scalaVersion := "2.12.2"

libraryDependencies ++= {
  val akkaVersion = "2.4.16"

  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.trueaccord.scalapb" %% "scalapb-runtime" % scalapbVersion % "protobuf"
  )
}

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)