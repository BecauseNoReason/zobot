name := "zobot"
version := "1.0"
scalaVersion := "2.11.8"

libraryDependencies ++= {
  val akkaVersion = "2.4.16"
  val sparkVersion = "2.2.0"
  val specsVersion = "3.9.1"

  Seq(
    "com.typesafe.akka"      %% "akka-actor"                    % akkaVersion,
    "org.apache.spark"       %% "spark-core"                    % sparkVersion,
    "org.apache.spark"       %% "spark-mllib"                   % sparkVersion,
    "org.apache.spark"       %% "spark-sql"                     % sparkVersion,
    "org.scalacheck"         %% "scalacheck"                    % "1.13.5"       % "test",
    "org.specs2"             %% "specs2-core"                   % specsVersion   % "test",
    "org.specs2"             %% "specs2-mock"                   % specsVersion   % "test",
    "org.specs2"             %% "specs2-matcher-extra"          % specsVersion   % "test",
    "com.datastax.spark"     % "spark-cassandra-connector_2.10" % "2.0.3"
  )
}
